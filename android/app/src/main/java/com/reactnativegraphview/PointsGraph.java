package com.reactnativegraphview;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.series.BarGraphSeries;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.PointsGraphSeries;

public class PointsGraph extends SimpleViewManager<GraphView> {
    @Override
    public String getName() {
        return "PointsGraph";
    }

    @Override
    protected GraphView createViewInstance(ThemedReactContext reactContext) {
        GraphView graphView = new GraphView(reactContext);
        return graphView;
    }

    @ReactProp(name = "data")
    public void setData(GraphView graphView, ReadableArray data){
        DataPoint[] points = new DataPoint[data.size()];
        for(int i=0; i < data.size(); i++){
            ReadableMap readableMap = data.getMap(i);
            int x = readableMap.getInt("x");
            int y = readableMap.getInt("y");
            points[i] = new DataPoint(x, y);
        }
        PointsGraphSeries<DataPoint> series = new PointsGraphSeries<>(points);
        graphView.addSeries(series);
    }
}