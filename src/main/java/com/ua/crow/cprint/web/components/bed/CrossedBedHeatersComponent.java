package com.ua.crow.cprint.web.components.bed;

import com.vaadin.flow.component.details.Details;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.theme.lumo.LumoUtility;

public class CrossedBedHeatersComponent extends Details {

    BedHeater bed1 = new BedHeater("Bed1");
    BedHeater bed2 = new BedHeater("Bed2");
    BedHeater bed3 = new BedHeater("Bed3");
    BedHeater bed4 = new BedHeater("Bed4");


    public CrossedBedHeatersComponent() {
        // Initialize Details with title "Heaters" and set it to be opened by default
        super("Heaters");
        this.setOpened(true);


        // Add the list component
        this.add(createListComponent());
    }

    private VerticalLayout createListComponent() {
        VerticalLayout vl = new VerticalLayout();
//        vl.getStyle().set("gridTemplateColumns", "repeat(auto-fill, minmax(200px, 1fr))");
        vl.addClassNames(
                LumoUtility.Gap.MEDIUM,
                LumoUtility.Display.GRID,
                LumoUtility.ListStyleType.NONE,
                LumoUtility.Margin.NONE,
                LumoUtility.Padding.NONE
        );
        bed1.addClassNames(LumoUtility.Gap.XSMALL);
        HorizontalLayout horizontalLayout = new HorizontalLayout();
        horizontalLayout.add(bed1);
        horizontalLayout.add(bed2);
        HorizontalLayout horizontalLayout1 = new HorizontalLayout();
        horizontalLayout1.add(bed3);
        horizontalLayout1.add(bed4);
        vl.add(horizontalLayout);
        vl.add(horizontalLayout1);
        return vl;
    }


}
