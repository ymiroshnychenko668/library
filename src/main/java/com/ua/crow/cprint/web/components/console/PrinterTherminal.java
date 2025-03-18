package com.ua.crow.cprint.web.components.console;

import com.flowingcode.vaadin.addons.xterm.ITerminalClipboard;
import com.flowingcode.vaadin.addons.xterm.ITerminalOptions;
import com.flowingcode.vaadin.addons.xterm.XTerm;
import com.vaadin.flow.component.html.Div;

public class PrinterTherminal extends XTerm {


    public PrinterTherminal() {


       writeln("Hello world.\n\n");
       setCursorBlink(true);
       setCursorStyle(ITerminalOptions.CursorStyle.UNDERLINE);

        setSizeFull();
        setCopySelection(true);
        setUseSystemClipboard(ITerminalClipboard.UseSystemClipboard.READWRITE);
        setPasteWithRightClick(true);

        addLineListener(ev->{
            String line = ev.getLine();
            System.out.println(line);
        });

        focus();

        fit();
    }
}
