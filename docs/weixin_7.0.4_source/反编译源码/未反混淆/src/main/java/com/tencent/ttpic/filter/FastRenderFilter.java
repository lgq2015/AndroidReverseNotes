package com.tencent.ttpic.filter;

import android.opengl.GLES20;
import android.text.TextUtils;
import com.tencent.filter.h;
import com.tencent.filter.m;
import com.tencent.filter.m.b;
import com.tencent.filter.m.i;
import com.tencent.filter.m.j;
import com.tencent.filter.m.n;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.ttpic.baseutils.FileUtils;
import com.tencent.ttpic.gles.AttributeParam;
import com.tencent.ttpic.gles.GlUtil;
import com.tencent.ttpic.model.RenderParam;
import com.tencent.ttpic.shader.Shader;
import com.tencent.ttpic.util.MatrixUtil;
import com.tencent.ttpic.util.VideoGlobalContext;
import com.tencent.ttpic.util.VideoMaterialUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FastRenderFilter {
    private static final String FRAGMENT_SHADER = FileUtils.loadAssetsString(VideoGlobalContext.getContext(), "camera/camera_video/shader/FastRenderFragmentShader.dat");
    private static final int MAX_DRAW_PER_RENDER = 8;
    private static final String VERTEX_SHADER = FileUtils.loadAssetsString(VideoGlobalContext.getContext(), "camera/camera_video/shader/FastRenderVertexShader.dat");
    private boolean hasBlendMode;
    protected int height;
    private Map<String, AttributeParam> mAttrParams;
    private int mCoordNum;
    private Map<String, m> mParamList;
    protected double mScreenScale;
    private Shader shader;
    protected int width;

    static {
        AppMethodBeat.i(82515);
        AppMethodBeat.o(82515);
    }

    public FastRenderFilter() {
        this(new Shader(VERTEX_SHADER, FRAGMENT_SHADER));
        AppMethodBeat.i(82489);
        AppMethodBeat.o(82489);
    }

    private FastRenderFilter(Shader shader) {
        AppMethodBeat.i(82490);
        this.hasBlendMode = false;
        this.shader = shader;
        this.mAttrParams = new HashMap();
        this.mParamList = new HashMap();
        AppMethodBeat.o(82490);
    }

    public void applyGLSLFilter() {
        AppMethodBeat.i(82491);
        initAttribParams();
        this.shader.compile();
        for (m initialParams : this.mParamList.values()) {
            initialParams.initialParams(this.shader.getShaderProgram());
        }
        for (AttributeParam initialParams2 : this.mAttrParams.values()) {
            initialParams2.initialParams(this.shader.getShaderProgram());
        }
        AppMethodBeat.o(82491);
    }

    public void initAttribParams() {
        AppMethodBeat.i(82492);
        setPositions(GlUtil.ORIGIN_TEX_COORDS_TRIANGLES);
        setTexCords(new float[]{0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 1.0f, 1.0f});
        setCoordNum(4);
        addAttribParam(new AttributeParam("a_stickerIndex", new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f}, 1));
        addAttribParam(new AttributeParam("texAnchor", new float[]{0.0f, 0.0f}, 2));
        addAttribParam(new AttributeParam("texScale", new float[]{0.0f}, 1));
        addAttribParam(new AttributeParam("texRotate", new float[]{0.0f, 0.0f, 0.0f}, 3));
        initParams();
        AppMethodBeat.o(82492);
    }

    public void setBlendMode(int i) {
        AppMethodBeat.i(82493);
        addParam(new i("blendMode", i));
        this.hasBlendMode = true;
        AppMethodBeat.o(82493);
    }

    public void updateVideoSize(int i, int i2) {
        AppMethodBeat.i(82494);
        this.width = i;
        this.height = i2;
        addParam(new b("canvasSize", (float) i, (float) i2));
        AppMethodBeat.o(82494);
    }

    public void addAttribParam(String str, float[] fArr) {
        AppMethodBeat.i(82495);
        addAttribParam(str, fArr, false);
        AppMethodBeat.o(82495);
    }

    public void addAttribParam(String str, float[] fArr, boolean z) {
        AppMethodBeat.i(82496);
        if (TextUtils.isEmpty(str)) {
            AppMethodBeat.o(82496);
            return;
        }
        AttributeParam attributeParam = (AttributeParam) this.mAttrParams.get(str);
        if (attributeParam == null) {
            attributeParam = new AttributeParam(str, fArr, z);
            this.mAttrParams.put(str, attributeParam);
        }
        attributeParam.setVertices(fArr);
        AppMethodBeat.o(82496);
    }

    public void addAttribParam(AttributeParam attributeParam) {
        AppMethodBeat.i(82497);
        if (attributeParam == null) {
            AppMethodBeat.o(82497);
            return;
        }
        AttributeParam attributeParam2 = (AttributeParam) this.mAttrParams.get(attributeParam.name);
        if (attributeParam2 == null) {
            attributeParam2 = new AttributeParam(attributeParam.name, attributeParam.vertices, attributeParam.perVertexFloat, false);
            this.mAttrParams.put(attributeParam.name, attributeParam2);
        }
        attributeParam2.setVertices(attributeParam.vertices);
        attributeParam2.perVertexFloat = attributeParam.perVertexFloat;
        AppMethodBeat.o(82497);
    }

    public AttributeParam getAttribParam(String str) {
        AppMethodBeat.i(82498);
        AttributeParam attributeParam = (AttributeParam) this.mAttrParams.get(str);
        AppMethodBeat.o(82498);
        return attributeParam;
    }

    public void addParam(m mVar) {
        AppMethodBeat.i(82499);
        if (mVar == null) {
            AppMethodBeat.o(82499);
            return;
        }
        m mVar2 = (m) this.mParamList.get(mVar.name);
        if (mVar2 == null) {
            this.mParamList.put(mVar.name, mVar);
            AppMethodBeat.o(82499);
            return;
        }
        mVar.handle = mVar2.handle;
        this.mParamList.put(mVar.name, mVar);
        AppMethodBeat.o(82499);
    }

    public void initParams() {
        AppMethodBeat.i(82500);
        addParam(new i("texNeedTransform", 1));
        addParam(new i("blendMode", 0));
        addParam(new b("canvasSize", 0.0f, 0.0f));
        addParam(new j("u_MVPMatrix", MatrixUtil.getMVPMatrix(6.0f, 4.0f, 10.0f)));
        addParam(new n(VideoMaterialUtil.CRAZYFACE_CANVAS, 0, 33986));
        for (int i = 0; i <= 7; i++) {
            addParam(new n("inputImageTexture".concat(String.valueOf(i)), 0, 33986));
        }
        AppMethodBeat.o(82500);
    }

    private boolean mergeRenderParams(List<RenderParam> list) {
        AppMethodBeat.i(82501);
        boolean mergeRenderParams = mergeRenderParams(list, false);
        AppMethodBeat.o(82501);
        return mergeRenderParams;
    }

    private boolean mergeRenderParams(List<RenderParam> list, boolean z) {
        AppMethodBeat.i(82502);
        if (list.isEmpty()) {
            AppMethodBeat.o(82502);
            return false;
        }
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        float[] fArr = new float[(((RenderParam) list.get(0)).position.length * list.size())];
        for (i = 0; i < list.size(); i++) {
            for (i2 = 0; i2 < ((RenderParam) list.get(i)).position.length; i2++) {
                fArr[(((RenderParam) list.get(i)).position.length * i) + i2] = ((RenderParam) list.get(i)).position[i2];
            }
        }
        setPositions(fArr);
        fArr = new float[(list.size() * GlUtil.ORIGIN_TEX_COORDS_TRIANGLES.length)];
        for (i2 = 0; i2 < list.size(); i2++) {
            for (i = 0; i < ((RenderParam) list.get(i2)).texCords.length; i++) {
                fArr[(((RenderParam) list.get(i2)).texCords.length * i2) + i] = ((RenderParam) list.get(i2)).texCords[i];
            }
        }
        setTexCords(fArr);
        float[] fArr2 = new float[(list.size() * 6)];
        if (z) {
            i = 0;
            i2 = 0;
            i3 = ((RenderParam) list.get(0)).texture;
            while (i2 < fArr2.length) {
                i4 = i2 / 6;
                if (((RenderParam) list.get(i4)).texture != i3) {
                    i++;
                    i3 = ((RenderParam) list.get(i4)).texture;
                }
                i5 = i;
                fArr2[i2] = ((float) i5) + 0.5f;
                i2++;
                i = i5;
            }
        } else {
            for (i5 = 0; i5 < fArr2.length; i5++) {
                fArr2[i5] = ((float) (i5 / 6)) + 0.5f;
            }
        }
        addAttribParam(new AttributeParam("a_stickerIndex", fArr2, 1));
        fArr = new float[((list.size() * 6) * 2)];
        for (i = 0; i < list.size(); i++) {
            for (i2 = 0; i2 < 12; i2++) {
                fArr[((i * 6) * 2) + i2] = ((RenderParam) list.get(i)).texAnchor[i2 % 2];
            }
        }
        addAttribParam(new AttributeParam("texAnchor", fArr, 2));
        fArr = new float[((list.size() * 6) * 1)];
        for (i = 0; i < list.size(); i++) {
            for (i2 = 0; i2 < 6; i2++) {
                fArr[(i * 6) + i2] = ((RenderParam) list.get(i)).texScale;
            }
        }
        addAttribParam(new AttributeParam("texScale", fArr, 1));
        fArr = new float[((list.size() * 6) * 3)];
        for (i = 0; i < list.size(); i++) {
            for (i2 = 0; i2 < 18; i2++) {
                fArr[((i * 6) * 3) + i2] = ((RenderParam) list.get(i)).texRotate[i2 % 3];
            }
        }
        addAttribParam(new AttributeParam("texRotate", fArr, 3));
        if (z) {
            i = ((RenderParam) list.get(0)).texture;
            i3 = 0;
            for (i2 = 0; i2 < list.size(); i2++) {
                if (((RenderParam) list.get(i2)).texture != i) {
                    i3++;
                    i = ((RenderParam) list.get(i2)).texture;
                }
                addParam(new n("inputImageTexture".concat(String.valueOf(i3)), ((RenderParam) list.get(i2)).texture, (this.hasBlendMode ? 1 : 0) + (33984 + i3)));
            }
        } else {
            for (i = 0; i < list.size(); i++) {
                String concat = "inputImageTexture".concat(String.valueOf(i));
                int i6 = ((RenderParam) list.get(i)).texture;
                i4 = 33984 + i;
                if (this.hasBlendMode) {
                    i5 = 1;
                } else {
                    i5 = 0;
                }
                addParam(new n(concat, i6, i5 + i4));
            }
        }
        setCoordNum(list.size() * 6);
        AppMethodBeat.o(82502);
        return true;
    }

    public void renderTexture() {
        AppMethodBeat.i(82503);
        GLES20.glDrawArrays(4, 0, this.mCoordNum);
        GLES20.glFlush();
        AppMethodBeat.o(82503);
    }

    public void render(int i, List<RenderParam> list, h hVar, boolean z) {
        AppMethodBeat.i(82504);
        if (i > 0) {
            addParam(new n(VideoMaterialUtil.CRAZYFACE_CANVAS, i, 33984));
        }
        render(list, hVar, z);
        AppMethodBeat.o(82504);
    }

    public void render(List<RenderParam> list, h hVar, boolean z) {
        AppMethodBeat.i(82505);
        if (list.size() > 0) {
            if (hVar != null) {
                addParam(new b("canvasSize", (float) hVar.width, (float) hVar.height));
                hVar.a(-1, hVar.width, hVar.height, 0.0d);
            } else {
                addParam(new b("canvasSize", (float) this.width, (float) this.height));
            }
            if (z) {
                Collections.sort(list, new Comparator<RenderParam>() {
                    public int compare(RenderParam renderParam, RenderParam renderParam2) {
                        return renderParam.texture - renderParam2.texture;
                    }
                });
                for (List mergeRenderParams : splitRenderParams(list, true)) {
                    if (mergeRenderParams(mergeRenderParams, true)) {
                        OnDrawFrameGLSL();
                        renderTexture();
                    }
                }
                AppMethodBeat.o(82505);
                return;
            }
            for (List mergeRenderParams2 : splitRenderParams(list)) {
                if (mergeRenderParams(mergeRenderParams2)) {
                    OnDrawFrameGLSL();
                    renderTexture();
                }
            }
        }
        AppMethodBeat.o(82505);
    }

    public void render(List<RenderParam> list, h hVar) {
        AppMethodBeat.i(82506);
        render(list, hVar, false);
        AppMethodBeat.o(82506);
    }

    private List<List<RenderParam>> splitRenderParams(List<RenderParam> list, boolean z) {
        int i = 0;
        AppMethodBeat.i(82507);
        if (z) {
            ArrayList arrayList = new ArrayList();
            int i2 = ((RenderParam) list.get(0)).texture;
            int i3 = 1;
            List arrayList2 = new ArrayList();
            while (i < list.size()) {
                RenderParam renderParam = (RenderParam) list.get(i);
                if (renderParam.texture == i2) {
                    arrayList2.add(renderParam);
                } else {
                    i3++;
                    if (i3 > 8) {
                        arrayList.add(arrayList2);
                        arrayList2 = new ArrayList();
                        i3 = 1;
                    }
                    arrayList2.add(renderParam);
                    i2 = renderParam.texture;
                }
                i++;
            }
            arrayList.add(arrayList2);
            AppMethodBeat.o(82507);
            return arrayList;
        }
        ArrayList arrayList3 = new ArrayList();
        while (i < (list.size() / 8) + 1) {
            int i4 = i * 8;
            int i5 = i4 + 8;
            if (i5 > list.size()) {
                i5 = list.size();
            }
            arrayList3.add(list.subList(i4, i5));
            i++;
        }
        AppMethodBeat.o(82507);
        return arrayList3;
    }

    private List<List<RenderParam>> splitRenderParams(List<RenderParam> list) {
        AppMethodBeat.i(82508);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < (list.size() / 8) + 1; i++) {
            int i2 = i * 8;
            int i3 = i2 + 8;
            if (i3 > list.size()) {
                i3 = list.size();
            }
            arrayList.add(list.subList(i2, i3));
        }
        AppMethodBeat.o(82508);
        return arrayList;
    }

    public void OnDrawFrameGLSL() {
        AppMethodBeat.i(82509);
        this.shader.bind();
        for (m params : this.mParamList.values()) {
            params.setParams(this.shader.getShaderProgram());
        }
        for (AttributeParam attributeParam : this.mAttrParams.values()) {
            if (attributeParam.handle >= 0) {
                attributeParam.setParams(this.shader.getShaderProgram());
            }
        }
        AppMethodBeat.o(82509);
    }

    public boolean setPositions(float[] fArr) {
        AppMethodBeat.i(82510);
        addAttribParam("position", fArr);
        AppMethodBeat.o(82510);
        return true;
    }

    public boolean setTexCords(float[] fArr) {
        AppMethodBeat.i(82511);
        addAttribParam("inputTextureCoordinate", fArr);
        AppMethodBeat.o(82511);
        return true;
    }

    public boolean setPositions(float[] fArr, boolean z) {
        AppMethodBeat.i(82512);
        addAttribParam("position", fArr, z);
        AppMethodBeat.o(82512);
        return true;
    }

    public boolean setTexCords(float[] fArr, boolean z) {
        AppMethodBeat.i(82513);
        addAttribParam("inputTextureCoordinate", fArr, z);
        AppMethodBeat.o(82513);
        return true;
    }

    public boolean setCoordNum(int i) {
        this.mCoordNum = i;
        return true;
    }

    public void clearGLSLSelf() {
        AppMethodBeat.i(82514);
        this.shader.clear();
        for (m clear : this.mParamList.values()) {
            clear.clear();
        }
        for (AttributeParam clear2 : this.mAttrParams.values()) {
            clear2.clear();
        }
        AppMethodBeat.o(82514);
    }
}
