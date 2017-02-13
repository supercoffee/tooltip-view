package com.venmo.view;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;

import static android.graphics.Path.Direction;

class BottomArrowLocation implements ArrowLocation {

    private Path basePath;

    @Override
    public void configureDraw(TooltipView view, Canvas canvas) {
        computeBasePath(view, canvas);
        view.setTooltipPath(basePath);
        view.setPaint(new Paint(Paint.ANTI_ALIAS_FLAG));
        view.getTooltipPaint().setColor(view.getTooltipColor());
    }

    private Path computeBasePath(TooltipView view, Canvas canvas) {
        if (basePath != null) {
            return basePath;
        }
        basePath = new Path();
        RectF pathBounds = new RectF(canvas.getClipBounds());
        pathBounds.bottom -= view.getArrowHeight();

        // Shrink the bounds by the blur radius so the shadow will fit inside the clipping bounds of the Canvas
        pathBounds.inset(view.getToolipShadowRadius(), view.getToolipShadowRadius());

        float middle = ArrowAlignmentHelper.calculateArrowMidPoint(view, pathBounds);
        int arrowDx = view.getArrowWidth() / 2;

        basePath.addRoundRect(pathBounds, view.getCornerRadius(), view.getCornerRadius(), Direction.CW);
        basePath.moveTo(middle, view.getHeight() - view.getToolipShadowRadius());
        basePath.lineTo(middle - arrowDx, pathBounds.bottom);
        basePath.lineTo(middle + arrowDx, pathBounds.bottom);
        basePath.close();

        return basePath;
    }
}
