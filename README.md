# TooltipView

A dead simple way to to add tooltips to your Android app.

```xml
<com.venmo.view.TooltipView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_alignLeft="@+id/anchored_view"
        android:layout_alignRight="@id/anchored_view"
        android:padding="8dp"
        android:gravity="center_horizontal"
        android:text="Your text here!"
        app:tooltipColor="#66009900"
        app:anchoredView="@id/anchored_view" />
```

Here are the attribute options:

```
app:tooltipColor="#66009900"
app:anchoredView="@id/anchored_view"
app:arrowWidth="120dp"
app:arrowHeight="120dp"
app:cornerRadius="16dp"
app:arrowOffset="30dp"
app:arrowAlignment="right"
app:shadowRadius="4dp"
app:shadowColor="@android:color/black"
```

Screenshot:
![https://raw.githubusercontent.com/venmo/tooltip-view/master/sample.png](https://raw.githubusercontent.com/venmo/tooltip-view/master/sample.png)

# Download
```groovy
    compile 'com.github.supercoffee:tooltip-view:0a1a2d311@aar'
```

## TODO
 - tooltips on the sides of the bubble
