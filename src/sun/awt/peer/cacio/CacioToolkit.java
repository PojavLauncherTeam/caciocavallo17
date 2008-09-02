/*
 * Copyright 2008 Sun Microsystems, Inc.  All Rights Reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Sun designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Sun in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Sun Microsystems, Inc., 4150 Network Circle, Santa Clara,
 * CA 95054 USA or visit www.sun.com if you need additional information or
 * have any questions.
 */

package sun.awt.peer.cacio;

import java.awt.Button;
import java.awt.Canvas;
import java.awt.Checkbox;
import java.awt.CheckboxMenuItem;
import java.awt.Choice;
import java.awt.Dialog;
import java.awt.FileDialog;
import java.awt.Frame;
import java.awt.HeadlessException;
import java.awt.Label;
import java.awt.List;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.PopupMenu;
import java.awt.ScrollPane;
import java.awt.Scrollbar;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.Window;
import java.awt.peer.ButtonPeer;
import java.awt.peer.CanvasPeer;
import java.awt.peer.CheckboxMenuItemPeer;
import java.awt.peer.CheckboxPeer;
import java.awt.peer.ChoicePeer;
import java.awt.peer.DialogPeer;
import java.awt.peer.FileDialogPeer;
import java.awt.peer.FramePeer;
import java.awt.peer.LabelPeer;
import java.awt.peer.ListPeer;
import java.awt.peer.MenuBarPeer;
import java.awt.peer.MenuItemPeer;
import java.awt.peer.MenuPeer;
import java.awt.peer.PopupMenuPeer;
import java.awt.peer.ScrollPanePeer;
import java.awt.peer.ScrollbarPeer;
import java.awt.peer.TextAreaPeer;
import java.awt.peer.TextFieldPeer;
import java.awt.peer.WindowPeer;

import sun.awt.SunToolkit;

public abstract class CacioToolkit extends SunToolkit {

    @Override
    public ButtonPeer createButton(Button target) throws HeadlessException {
        return new CacioButtonPeer(target, getPlatformWindowFactory());
    }

    @Override
    public CanvasPeer createCanvas(Canvas target) {
        return new CacioCanvasPeer(target, getPlatformWindowFactory());
    }
   
    @Override
    public CheckboxPeer createCheckbox(Checkbox target)
            throws HeadlessException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public CheckboxMenuItemPeer createCheckboxMenuItem(CheckboxMenuItem target)
            throws HeadlessException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ChoicePeer createChoice(Choice target) throws HeadlessException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public DialogPeer createDialog(Dialog target) throws HeadlessException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public FileDialogPeer createFileDialog(FileDialog target)
            throws HeadlessException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public FramePeer createFrame(Frame target) throws HeadlessException {
        return new CacioFramePeer(target, getPlatformWindowFactory());
    }

    @Override
    public LabelPeer createLabel(Label target) throws HeadlessException {
        return new CacioLabelPeer(target, getPlatformWindowFactory());
    }

    @Override
    public ListPeer createList(List target) throws HeadlessException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public MenuPeer createMenu(Menu target) throws HeadlessException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public MenuBarPeer createMenuBar(MenuBar target) throws HeadlessException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public MenuItemPeer createMenuItem(MenuItem target)
            throws HeadlessException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public PopupMenuPeer createPopupMenu(PopupMenu target)
            throws HeadlessException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ScrollPanePeer createScrollPane(ScrollPane target)
            throws HeadlessException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ScrollbarPeer createScrollbar(Scrollbar target)
            throws HeadlessException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public TextAreaPeer createTextArea(TextArea target)
            throws HeadlessException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public TextFieldPeer createTextField(TextField target)
            throws HeadlessException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public WindowPeer createWindow(Window target) throws HeadlessException {

        return new CacioWindowPeer(target, getPlatformWindowFactory());

    }

    public abstract PlatformWindowFactory getPlatformWindowFactory();
}