package com.tencent.ttpic.filter;

import android.graphics.Bitmap;
import com.tencent.filter.m.b;
import com.tencent.filter.m.f;
import com.tencent.filter.m.i;
import com.tencent.filter.m.k;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.ttpic.PTDetectInfo;
import com.tencent.ttpic.PTFaceAttr.PTExpression;
import com.tencent.ttpic.baseutils.BitmapUtils;
import com.tencent.ttpic.gles.GlUtil;
import com.tencent.ttpic.gles.GlUtil.DRAW_MODE;
import com.tencent.ttpic.model.FaceItem;
import com.tencent.ttpic.shader.ShaderCreateFactory.PROGRAM_TYPE;
import com.tencent.ttpic.util.FaceOffUtil;
import com.tencent.ttpic.util.VideoMaterialUtil;
import java.util.List;

public class FaceOffByImageFilter extends VideoFilterBase {
    private static final String TAG = FaceOffByImageFilter.class.getSimpleName();
    private int faceImageHeight;
    private int faceImageWidth;
    private float[] faceVertices = new float[1380];
    private int grayImageHeight;
    private int grayImageWidth;
    private float[] grayVertices = new float[1380];
    private FaceItem item;
    private float[] texVertices = new float[1380];

    static {
        AppMethodBeat.i(82412);
        AppMethodBeat.o(82412);
    }

    public FaceOffByImageFilter(FaceItem faceItem) {
        super(PROGRAM_TYPE.FACEOFF);
        AppMethodBeat.i(82407);
        this.item = faceItem;
        initParams();
        AppMethodBeat.o(82407);
    }

    public void initParams() {
        AppMethodBeat.i(82408);
        Bitmap faceBitmap = FaceOffUtil.getFaceBitmap(this.item.faceExchangeImage);
        Bitmap grayBitmap = FaceOffUtil.getGrayBitmap(this.item.featureType);
        if (BitmapUtils.isLegal(faceBitmap) && BitmapUtils.isLegal(grayBitmap)) {
            this.faceImageWidth = faceBitmap.getWidth();
            this.faceImageHeight = faceBitmap.getHeight();
            this.grayImageWidth = grayBitmap.getWidth();
            this.grayImageHeight = grayBitmap.getHeight();
            addParam(new k("inputImageTexture2", faceBitmap, 33986, true));
            addParam(new k("inputImageTexture3", grayBitmap, 33987, true));
            addParam(new i("enableFaceOff", 1));
            addParam(new f("alpha", this.item.blendAlpha));
            addParam(new b("canvasSize", 0.0f, 0.0f));
            addParam(new f("positionRotate", 0.0f));
            addParam(new i("enableAlphaFromGray", this.item.grayScale));
            AppMethodBeat.o(82408);
            return;
        }
        AppMethodBeat.o(82408);
    }

    public void updatePreview(PTDetectInfo pTDetectInfo) {
        AppMethodBeat.i(82409);
        if (pTDetectInfo.triggeredExpression.contains(Integer.valueOf(PTExpression.FACE_DETECT.value))) {
            List fullCoords = FaceOffUtil.getFullCoords(VideoMaterialUtil.copyList(pTDetectInfo.facePoints), 2.0f);
            VideoMaterialUtil.flipYPoints(fullCoords, (int) (((double) this.height) * this.mFaceDetScale));
            setPositions(FaceOffUtil.initFacePositions(fullCoords, (int) (((double) this.width) * this.mFaceDetScale), (int) (((double) this.height) * this.mFaceDetScale), this.faceVertices));
            setCoordNum(690);
            addParam(new f("positionRotate", -pTDetectInfo.phoneAngle));
            AppMethodBeat.o(82409);
            return;
        }
        setPositions(GlUtil.EMPTY_POSITIONS);
        setCoordNum(4);
        AppMethodBeat.o(82409);
    }

    public void initAttribParams() {
        AppMethodBeat.i(82410);
        super.initAttribParams();
        List genPoints = FaceOffUtil.genPoints(this.item.facePoints);
        List grayCoords = FaceOffUtil.getGrayCoords(this.item.featureType);
        genPoints = FaceOffUtil.getFullCoords(genPoints, 2.0f);
        grayCoords = FaceOffUtil.getFullCoords(grayCoords, 2.0f);
        setTexCords(FaceOffUtil.initMaterialFaceTexCoords(genPoints, this.faceImageWidth, this.faceImageHeight, this.texVertices));
        setGrayCords(FaceOffUtil.initMaterialFaceTexCoords(grayCoords, this.grayImageWidth, this.grayImageHeight, this.grayVertices));
        setDrawMode(DRAW_MODE.TRIANGLES);
        setCoordNum(690);
        AppMethodBeat.o(82410);
    }

    public void updateVideoSize(int i, int i2, double d) {
        AppMethodBeat.i(82411);
        super.updateVideoSize(i, i2, d);
        addParam(new b("canvasSize", (float) i, (float) i2));
        AppMethodBeat.o(82411);
    }
}
