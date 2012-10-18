
package com.kendoui.taglib.treeview;

import com.kendoui.taglib.BaseTag;

import javax.servlet.jsp.JspException;

@SuppressWarnings("serial")
public class CheckboxesTag extends BaseTag /* interfaces *//* interfaces */ {
    
    @Override
    public int doEndTag() throws JspException {
//>> doEndTag

        Checkboxes parent = (Checkboxes)findParentWithClass(Checkboxes.class);

        parent.setCheckboxes(this);

//<< doEndTag

        return super.doEndTag();
    }

    @Override
    public void initialize() {
//>> initialize
//<< initialize

        super.initialize();
    }

    @Override
    public void destroy() {
//>> destroy
//<< destroy

        super.destroy();
    }

//>> Attributes

    public static String tagName() {
        return "treeView-checkboxes";
    }

    public boolean getCheckChildren() {
        return (boolean)getProperty("checkChildren");
    }

    public void setCheckChildren(boolean value) {
        setProperty("checkChildren", value);
    }

    public String getTemplate() {
        return (String)getProperty("template");
    }

    public void setTemplate(String value) {
        setProperty("template", value);
    }

//<< Attributes

}
