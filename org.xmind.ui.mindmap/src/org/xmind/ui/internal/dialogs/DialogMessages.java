/* ******************************************************************************
 * Copyright (c) 2006-2008 XMind Ltd. and others.
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
package org.xmind.ui.internal.dialogs;

import org.eclipse.osgi.util.NLS;

public class DialogMessages extends NLS {

    private static final String BUNDLE_NAME = "org.xmind.ui.internal.dialogs.messages"; //$NON-NLS-1$

    public static String CommonDialogTitle;
    public static String Open_title;
    public static String Save_title;
    public static String Error_title;
    public static String MultipleErrors_title;

    public static String ErrorOpen_title;
    public static String ErrorSave_title;
    public static String FailedToLoadWorkbook_message;
    public static String FailedToSaveWorkbook_message;

    public static String CompatibilityWarning_title;
    public static String CompatibilityWarning_message;

    public static String ConfirmOverwrite_title;
    public static String ConfirmOverwrite_message;

    public static String ConfirmRestart_title;
    public static String ConfirmRestart_message;
    public static String ConfirmRestart_Restart;
    public static String ConfirmRestart_Continue;

    public static String ConfirmWorkbookVersion_title;
    public static String ConfirmWorkbookVersion_message;
    public static String ConfirmWorkbookVersion_SaveAs;

    public static String HyperlinkDialog_title;
    public static String HyperlinkDialog_description;
    public static String HyperlinkDialog_Remove;
    public static String HyperlinkDialog_MultipleTopics_message;
    public static String HyperlinkDialog_MultipleTopics_value;
    public static String HyperlinkDialog_windowTitle;

    public static String HyperlinkDialog2_FailCreatePage_message;

    public static String NotesPopup_GotoNotesView_text;

    public static String SelectImageDialog_title;

    public static String TemplateMissing_message;

    public static String AllFilesFilterName;
    public static String WebHyperlinkPage_label;
    public static String WebHyperlinkPage_nullHyper_message;

    public static String WorkbookFilterName;
    public static String TemplateFilterName;

    public static String TopicHyperlinkPage_label;
    public static String OldWorkbookFilterName;
    public static String AllSupportedFilesFilterName;
    public static String MarkerPackageFilterName;

    public static String PageSetupDialog_windowTitle;
    public static String PageSetupDialog_title;
    public static String PageSetupDialog_description;
    public static String PageSetupDialog_PageSetup;
    public static String PageSetupDialog_Margins;
    public static String PageSetupDialog_HeaderFooter;
    public static String PageSetupDialog_Background;
    public static String PageSetupDialog_Border;
    public static String PageSetupDialog_Left;
    public static String PageSetupDialog_Right;
    public static String PageSetupDialog_Top;
    public static String PageSetupDialog_Bottom;
    public static String PageSetupDialog_Inch;
    public static String PageSetupDialog_Millimeter;
    public static String PageSetupDialog_Header;
    public static String PageSetupDialog_Footer;
    public static String PageSetupDialog_AlignLeft_text;
    public static String PageSetupDialog_AlignLeft_toolTip;
    public static String PageSetupDialog_AlignRight_text;
    public static String PageSetupDialog_AlignRight_toolTip;
    public static String PageSetupDialog_AlignCenter_text;
    public static String PageSetupDialog_AlignCenter_toolTip;
    public static String PageSetupDialog_Font_text;
    public static String PageSetupDialog_Font_toolTip;
    public static String PageSetupDialog_JustForReference;

    public static String FileHyperlinkPage_ChooseFile_text;

    public static String FileHyperlinkPage_ChooseFolder_text;

    public static String FileHyperlinkPage_FileNotExists_message;

    public static String FileHyperlinkPage_label;

    public static String FileHyperlinkPage_OpenDirectoryDialog_windowTitle;

    public static String FileHyperlinkPage_OpenFileDialog_windowTitle;

    public static String FindReplaceDialog_windowTitle;
    public static String FindReplaceDialog_Find_label;
    public static String FindReplaceDialog_ReplaceWith_label;
    public static String FindReplaceDialog_OptionGroup;
    public static String FindReplaceDialog_CaseSensitive;
    public static String FindReplaceDialog_WholeWord;
    public static String FindReplaceDialog_DirectionGroup;
    public static String FindReplaceDialog_Forward;
    public static String FindReplaceDialog_Backward;
    public static String FindReplaceDialog_ScopeGroup;
    public static String FindReplaceDialog_CurrentMap;
    public static String FindReplaceDialog_Workbook;
    public static String FindReplaceDialog_Find_text;
    public static String FindReplaceDialog_FindAll_text;
    public static String FindReplaceDialog_Replace_text;
    public static String FindReplaceDialog_ReplaceAll_text;
    public static String FindReplaceDialog_StringNotFound;

    static {
        // initialize resource bundle
        NLS.initializeMessages(BUNDLE_NAME, DialogMessages.class);
    }

    private DialogMessages() {
    }
}