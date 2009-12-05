/* ******************************************************************************
 * Copyright (c) 2006-2009 XMind Ltd. and others.
 * 
 * This file is a part of XMind 3. XMind releases 3 and
 * above are dual-licensed under the Eclipse Public License (EPL),
 * which is available at http://www.eclipse.org/legal/epl-v10.html
 * and the GNU Lesser General Public License (LGPL), 
 * which is available at http://www.gnu.org/licenses/lgpl.html
 * See http://www.xmind.net/license.html for details.
 * 
 * Contributors:
 *     XMind Ltd. - initial API and implementation
 *******************************************************************************/
package org.xmind.ui.internal.actions;

import org.eclipse.jface.action.Action;
import org.xmind.gef.ui.editor.IGraphicalEditorPage;
import org.xmind.ui.internal.MindMapMessages;
import org.xmind.ui.tabfolder.PageTitleEditor;

public class RenameSheetAction extends Action {

    private IGraphicalEditorPage page;

    public RenameSheetAction() {
        setId(ActionConstants.RENAME_SHEET_ID);
        setText(MindMapMessages.RenameSheet_text);
        setToolTipText(MindMapMessages.RenameSheet_toolTip);
    }

    public void setActivePage(IGraphicalEditorPage page) {
        this.page = page;
    }

    public void run() {
        if (page == null)
            return;

        PageTitleEditor titleEditor = (PageTitleEditor) page.getParentEditor()
                .getAdapter(PageTitleEditor.class);
        if (titleEditor != null) {
            titleEditor.startEditing(page.getIndex());
        }
    }

}