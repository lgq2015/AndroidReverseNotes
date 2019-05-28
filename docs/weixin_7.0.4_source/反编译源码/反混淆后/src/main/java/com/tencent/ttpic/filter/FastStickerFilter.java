package com.tencent.ttpic.filter;

import com.tencent.filter.C25624m.C0935i;
import com.tencent.filter.C25624m.C25626j;
import com.tencent.filter.C25624m.C25627n;
import com.tencent.filter.C25624m.C25629b;
import com.tencent.filter.C41672h;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.ttpic.PTDetectInfo;
import com.tencent.ttpic.gles.AttributeParam;
import com.tencent.ttpic.gles.GlUtil;
import com.tencent.ttpic.gles.GlUtil.DRAW_MODE;
import com.tencent.ttpic.model.FastDynamicSticker;
import com.tencent.ttpic.model.FastStaticSticker;
import com.tencent.ttpic.model.FastSticker;
import com.tencent.ttpic.model.RenderParam;
import com.tencent.ttpic.model.StickerItem;
import com.tencent.ttpic.shader.ShaderCreateFactory.PROGRAM_TYPE;
import com.tencent.ttpic.util.AlgoUtils;
import com.tencent.ttpic.util.BenchUtil;
import com.tencent.ttpic.util.MatrixUtil;
import com.tencent.ttpic.util.VideoFilterFactory.POSITION_TYPE;
import com.tencent.ttpic.util.VideoFilterUtil.RATIO_MODE;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FastStickerFilter extends VideoFilterBase {
    private String TAG = FastStickerFilter.class.getSimpleName();
    private int faceCount;
    private List<RenderParam> renderParams = new ArrayList();
    private RenderParam srcRenderParam;
    private List<FastSticker> stickerList = new ArrayList();

    public FastStickerFilter() {
        super(PROGRAM_TYPE.FAST_STICKER);
        AppMethodBeat.m2504i(82516);
        initParams();
        setDrawMode(DRAW_MODE.TRIANGLES);
        AppMethodBeat.m2505o(82516);
    }

    public void ApplyGLSLFilter() {
        AppMethodBeat.m2504i(82517);
        super.ApplyGLSLFilter();
        for (FastSticker ApplyGLSLFilter : this.stickerList) {
            ApplyGLSLFilter.ApplyGLSLFilter();
        }
        AppMethodBeat.m2505o(82517);
    }

    public void updatePreview(PTDetectInfo pTDetectInfo) {
        AppMethodBeat.m2504i(82518);
        for (FastSticker updatePreview : this.stickerList) {
            updatePreview.updatePreview(pTDetectInfo);
        }
        AppMethodBeat.m2505o(82518);
    }

    public void addSrcTexture(int i) {
        AppMethodBeat.m2504i(82519);
        if (i > 0) {
            this.srcRenderParam = new RenderParam();
            this.srcRenderParam.texture = i;
            this.srcRenderParam.position = AlgoUtils.calPositionsTriangles(0.0f, (float) this.height, (float) this.width, 0.0f, this.width, this.height);
            this.srcRenderParam.texScale = 1.0f;
        }
        AppMethodBeat.m2505o(82519);
    }

    public void setRenderParams(int i) {
        AppMethodBeat.m2504i(82520);
        for (FastSticker fastSticker : this.stickerList) {
            if (fastSticker.needRender(i)) {
                this.renderParams.add(fastSticker.getRenderParam().copy());
            }
        }
        AppMethodBeat.m2505o(82520);
    }

    public void render(C41672h c41672h) {
        AppMethodBeat.m2504i(82521);
        int i = ((this.renderParams.isEmpty() || this.faceCount <= 0) && this.srcRenderParam == null) ? 0 : 1;
        if (i != 0) {
            mergeRenderParam(this.srcRenderParam, this.renderParams);
            RenderProcess(c41672h.texture[0], c41672h.width, c41672h.height, -1, 0.0d, c41672h);
        }
        this.renderParams.clear();
        this.srcRenderParam = null;
        AppMethodBeat.m2505o(82521);
    }

    private void mergeRenderParam(RenderParam renderParam, List<RenderParam> list) {
        int i;
        int i2;
        int i3;
        AppMethodBeat.m2504i(82522);
        BenchUtil.benchStart("mergeRenderParam");
        if (renderParam != null) {
            i = 1;
        } else {
            i = 0;
        }
        float[] fArr = new float[((list.size() + i) * GlUtil.EMPTY_POSITIONS_TRIANGLES.length)];
        float[] fArr2 = new float[((list.size() + i) * GlUtil.ORIGIN_TEX_COORDS_TRIANGLES.length)];
        float[] fArr3 = new float[((list.size() + i) * 6)];
        float[] fArr4 = new float[(((list.size() + i) * 6) * 2)];
        float[] fArr5 = new float[(((list.size() + i) * 6) * 1)];
        float[] fArr6 = new float[(((list.size() + i) * 6) * 3)];
        if (renderParam != null) {
            for (i2 = 0; i2 < renderParam.position.length; i2++) {
                fArr[i2] = renderParam.position[i2];
            }
            for (i2 = 0; i2 < GlUtil.ORIGIN_TEX_COORDS_TRIANGLES.length; i2++) {
                fArr2[i2] = GlUtil.ORIGIN_TEX_COORDS_TRIANGLES[i2];
            }
            for (i2 = 0; i2 < 6; i2++) {
                fArr3[i2] = 0.5f;
            }
            for (i2 = 0; i2 < 12; i2++) {
                fArr4[i2] = renderParam.texAnchor[i2 % 2];
            }
            for (i2 = 0; i2 < 6; i2++) {
                fArr5[i2] = renderParam.texScale;
            }
            for (i2 = 0; i2 < 18; i2++) {
                fArr6[i2] = renderParam.texRotate[i2 % 3];
            }
            addParam(new C25627n("inputImageTexture0", renderParam.texture, 33985));
            i3 = 1;
        } else {
            i3 = 0;
        }
        if (!list.isEmpty()) {
            int i4;
            int i5;
            HashMap hashMap = new HashMap();
            int i6 = i3;
            for (i4 = 0; i4 < list.size(); i4++) {
                RenderParam renderParam2 = (RenderParam) list.get(i4);
                if (!hashMap.containsKey(renderParam2.f17530id)) {
                    hashMap.put(renderParam2.f17530id, Integer.valueOf(i6));
                    addParam(new C25627n("inputImageTexture".concat(String.valueOf(i6)), ((RenderParam) list.get(i4)).texture, 33985 + i6));
                }
                i2 = 0;
                while (true) {
                    i5 = i2;
                    if (i5 >= 6) {
                        break;
                    }
                    fArr3[(i6 * 6) + i5] = ((float) ((Integer) hashMap.get(((RenderParam) list.get(i4)).f17530id)).intValue()) + 0.5f;
                    i2 = i5 + 1;
                }
                i6++;
            }
            i6 = i3;
            for (i4 = 0; i4 < list.size(); i4++) {
                i2 = 0;
                while (true) {
                    i5 = i2;
                    if (i5 >= ((RenderParam) list.get(i4)).position.length) {
                        break;
                    }
                    fArr[(((RenderParam) list.get(i4)).position.length * i6) + i5] = ((RenderParam) list.get(i4)).position[i5];
                    i2 = i5 + 1;
                }
                i6++;
            }
            i4 = i3;
            for (i2 = 0; i2 < list.size(); i2++) {
                for (i6 = 0; i6 < GlUtil.ORIGIN_TEX_COORDS_TRIANGLES.length; i6++) {
                    fArr2[(GlUtil.ORIGIN_TEX_COORDS_TRIANGLES.length * i4) + i6] = GlUtil.ORIGIN_TEX_COORDS_TRIANGLES[i6];
                }
                i4++;
            }
            i6 = i3;
            for (i4 = 0; i4 < list.size(); i4++) {
                i2 = 0;
                while (true) {
                    i5 = i2;
                    if (i5 >= 12) {
                        break;
                    }
                    fArr4[((i6 * 6) * 2) + i5] = ((RenderParam) list.get(i4)).texAnchor[i5 % 2];
                    i2 = i5 + 1;
                }
                i6++;
            }
            i6 = i3;
            for (i4 = 0; i4 < list.size(); i4++) {
                i2 = 0;
                while (true) {
                    i5 = i2;
                    if (i5 >= 6) {
                        break;
                    }
                    fArr5[(i6 * 6) + i5] = ((RenderParam) list.get(i4)).texScale;
                    i2 = i5 + 1;
                }
                i6++;
            }
            i2 = 0;
            while (true) {
                i4 = i2;
                if (i4 >= list.size()) {
                    break;
                }
                i2 = 0;
                while (true) {
                    i6 = i2;
                    if (i6 >= 18) {
                        break;
                    }
                    fArr6[((i3 * 6) * 3) + i6] = ((RenderParam) list.get(i4)).texRotate[i6 % 3];
                    i2 = i6 + 1;
                }
                i3++;
                i2 = i4 + 1;
            }
        }
        setPositions(fArr);
        setTexCords(fArr2);
        setCoordNum((list.size() + i) * 6);
        addAttribParam(new AttributeParam("a_stickerIndex", fArr3, 1));
        addAttribParam(new AttributeParam("texAnchor", fArr4, 2));
        addAttribParam(new AttributeParam("texScale", fArr5, 1));
        addAttribParam(new AttributeParam("texRotate", fArr6, 3));
        BenchUtil.benchEnd("mergeRenderParam");
        AppMethodBeat.m2505o(82522);
    }

    public void setFaceCount(int i) {
        this.faceCount = i;
    }

    public void initParams() {
        AppMethodBeat.m2504i(82523);
        addParam(new C0935i("texNeedTransform", 1));
        addParam(new C25629b("canvasSize", 0.0f, 0.0f));
        addParam(new C25626j("u_MVPMatrix", MatrixUtil.getMVPMatrix(6.0f, 4.0f, 10.0f)));
        for (int i = 0; i <= 7; i++) {
            addParam(new C25627n("inputImageTexture".concat(String.valueOf(i)), 0, 33986));
        }
        AppMethodBeat.m2505o(82523);
    }

    public void updateVideoSize(int i, int i2, double d) {
        AppMethodBeat.m2504i(82524);
        this.width = i;
        this.height = i2;
        addParam(new C25629b("canvasSize", (float) i, (float) i2));
        for (FastSticker updateVideoSize : this.stickerList) {
            updateVideoSize.updateVideoSize(i, i2, d);
        }
        AppMethodBeat.m2505o(82524);
    }

    public void setRatioMode(RATIO_MODE ratio_mode) {
        AppMethodBeat.m2504i(82525);
        for (FastSticker fastSticker : this.stickerList) {
            if (fastSticker instanceof FastStaticSticker) {
                ((FastStaticSticker) fastSticker).setRatioMode(ratio_mode);
            }
        }
        AppMethodBeat.m2505o(82525);
    }

    public boolean setPositions(float[] fArr) {
        AppMethodBeat.m2504i(82526);
        addAttribParam("position", fArr);
        AppMethodBeat.m2505o(82526);
        return true;
    }

    public boolean setTexCords(float[] fArr) {
        AppMethodBeat.m2504i(82527);
        addAttribParam("inputTextureCoordinate", fArr);
        AppMethodBeat.m2505o(82527);
        return true;
    }

    public void initAttribParams() {
        AppMethodBeat.m2504i(82528);
        setPositions(GlUtil.ORIGIN_TEX_COORDS_TRIANGLES);
        setTexCords(new float[]{0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 1.0f, 1.0f});
        setCoordNum(4);
        addAttribParam(new AttributeParam("a_stickerIndex", new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f}, 1));
        addAttribParam(new AttributeParam("texAnchor", new float[]{0.0f, 0.0f}, 2));
        addAttribParam(new AttributeParam("texScale", new float[]{0.0f}, 1));
        addAttribParam(new AttributeParam("texRotate", new float[]{0.0f, 0.0f, 0.0f}, 3));
        AppMethodBeat.m2505o(82528);
    }

    public void addSticker(StickerItem stickerItem, String str) {
        AppMethodBeat.m2504i(82529);
        if (stickerItem.type == POSITION_TYPE.STATIC.type || stickerItem.type == POSITION_TYPE.RELATIVE.type) {
            this.stickerList.add(new FastStaticSticker(stickerItem, str));
            AppMethodBeat.m2505o(82529);
            return;
        }
        if (stickerItem.type == POSITION_TYPE.DYNAMIC.type || stickerItem.type == POSITION_TYPE.GESTURE.type || stickerItem.type == POSITION_TYPE.BODY.type) {
            this.stickerList.add(new FastDynamicSticker(stickerItem, str));
        }
        AppMethodBeat.m2505o(82529);
    }

    public int getStickerListSize() {
        AppMethodBeat.m2504i(82530);
        int size = this.stickerList.size();
        AppMethodBeat.m2505o(82530);
        return size;
    }

    public void destroyAudio() {
        AppMethodBeat.m2504i(82531);
        for (FastSticker destroyAudio : this.stickerList) {
            destroyAudio.destroyAudio();
        }
        AppMethodBeat.m2505o(82531);
    }

    public void clearGLSLSelf() {
        AppMethodBeat.m2504i(82532);
        super.clearGLSLSelf();
        for (FastSticker destroy : this.stickerList) {
            destroy.destroy();
        }
        AppMethodBeat.m2505o(82532);
    }

    public void reset() {
        AppMethodBeat.m2504i(82533);
        for (FastSticker reset : this.stickerList) {
            reset.reset();
        }
        AppMethodBeat.m2505o(82533);
    }

    public void setAudioPause(boolean z) {
        AppMethodBeat.m2504i(82534);
        for (FastSticker audioPause : this.stickerList) {
            audioPause.setAudioPause(z);
        }
        AppMethodBeat.m2505o(82534);
    }
}
