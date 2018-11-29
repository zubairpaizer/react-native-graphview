package com.reactnativegraphview;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;
import android.view.ViewGroup.LayoutParams;
import org.json.JSONObject;

public class LineGraph extends SimpleViewManager<GraphView> {

    private String title = "rwerwr";
    private String color = "";
    private Boolean drawDataPoints = false;
    private int dataPointRadius = 10;
    private int thickness = 8;

    @Override
    public String getName() {
        return "LineGraph";
    }

    @ReactProp(name = "title")
    public void setTitle(GraphView graphView, String title){
        //series.setTitle(title);
        this.title = "Some thing i am doing here";
    }

    @ReactProp(name = "color")
    public void setColor(GraphView graphView, String data){
        //series.setColor(Color.GREEN);
    }

    @ReactProp(name = "drawDataPoints")
    public void setDrawDataPoints(GraphView graphView, Boolean showPoints){
        //series.setDrawDataPoints(showPoints);
    }

    @ReactProp(name = "dataPointsRadius")
    public void setDataPointsRadius(GraphView graphView, int radius){
        //series.setDataPointsRadius(radius);
    }

    @ReactProp(name = "thickness")
    public void setThickness(GraphView graphView, int thickness){
        //series.setThickness(thickness);
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
        LineGraphSeries<DataPoint> series = new LineGraphSeries<>(points);
        series.setTitle(this.title);
        graphView.addSeries(series);
    }
}