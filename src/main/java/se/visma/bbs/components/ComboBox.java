package se.visma.bbs.components;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by gideon on 2014-03-03.
 */
@XmlRootElement(name = "combobox")
@JsonIgnoreProperties(ignoreUnknown = true)
public class ComboBox extends UITemplate {

    private long uniqueId = 0;
    private String label = null;
    private List<Languages> labelLanguage = new ArrayList<Languages>();
    private String toolTips = null;
    private int labelWidth = 0;
    private String labelPosition = null;
    private String textStyle = null;
    private String type = null;
    private int textSize = 0;
    private String textFormat = null;
    private boolean mandatoryInfo = false;
    private boolean personNumber = false;
    private int componentHeight = 0;
    private int componentWidth = 0;
    private String inMappingDefValue = null;
    private String fromMappingField = null;
    private String toMappingField = null;
    private String printOrder = null;
    private int inputLength = 0;
    private boolean printOnApprovalMail = false;
    private boolean printOnOrderMail = false;
    private boolean readOnly = false;
    private boolean doNotShow = false;
    private boolean keepAfterAdding = false;
    private List<Option> addedOptions = new ArrayList<Option>();
    private String viewToCall = null;


    public ComboBox(){
        this.type = this.getClass().getSimpleName().toLowerCase();
    }

    public long getUniqueId() {
        return uniqueId;
    }

    @XmlElement
    public void setUniqueId(long uniqueId) {
        this.uniqueId = uniqueId;
    }

    public String getLabel() {
        return label;
    }

    @XmlElement
    public void setLabel(String label) {
        this.label = label;
    }

    public List<Languages> getLabelLanguage() {
        return labelLanguage;
    }

    @XmlElement
    public void setLabelLanguage(List<Languages> labelLanguage) {
        this.labelLanguage = labelLanguage;
    }

    public List<Option> getAddedOptions() {
        return addedOptions;
    }

    @XmlElement
    public void setAddedOptions(List<Option> addedOptions) {
        this.addedOptions = addedOptions;
    }


    public String getToolTips() {
        return toolTips;
    }


    @XmlElement
    public void setToolTips(String toolTips) {
        this.toolTips = toolTips;
    }

    public int getLabelWidth() {
        return labelWidth;
    }

    @XmlElement
    public void setLabelWidth(int labelWidth) {
        this.labelWidth = labelWidth;
    }

    public String getLabelPosition() {
        return labelPosition;
    }

    @XmlElement
    public void setLabelPosition(String labelPosition) {
        this.labelPosition = labelPosition;
    }

    public String getTextStyle() {
        return textStyle;
    }

    @XmlElement
    public void setTextStyle(String textStyle) {
        this.textStyle = textStyle;
    }

    public String getType() {
        return type;
    }

    @XmlElement
    public void setType(String type) {
        this.type = type;
    }

    public int getTextSize() {
        return textSize;
    }

    @XmlElement
    public void setTextSize(int textSize) {
        this.textSize = textSize;
    }

    public String getTextFormat() {
        return textFormat;
    }

    @XmlElement
    public void setTextFormat(String textFormat) {
        this.textFormat = textFormat;
    }

    public boolean isMandatoryInfo() {
        return mandatoryInfo;
    }

    @XmlElement
    public void setMandatoryInfo(boolean mandatoryInfo) {
        this.mandatoryInfo = mandatoryInfo;
    }

    public boolean isPersonNumber() {
        return personNumber;
    }

    @XmlElement
    public void setPersonNumber(boolean personNumber) {
        this.personNumber = personNumber;
    }

    public int getComponentHeight() {
        return componentHeight;
    }

    @XmlElement
    public void setComponentHeight(int componentHeight) {
        this.componentHeight = componentHeight;
    }

    public int getComponentWidth() {
        return componentWidth;
    }

    @XmlElement
    public void setComponentWidth(int componentWidth) {
        this.componentWidth = componentWidth;
    }

    public String getInMappingDefValue() {
        return inMappingDefValue;
    }

    @XmlElement
    public void setInMappingDefValue(String inMappingDefValue) {
        this.inMappingDefValue = inMappingDefValue;
    }

    public String getFromMappingField() {
        return fromMappingField;
    }

    @XmlElement
    public void setFromMappingField(String fromMappingField) {
        this.fromMappingField = fromMappingField;
    }

    public String getToMappingField() {
        return toMappingField;
    }

    @XmlElement
    public void setToMappingField(String toMappingField) {
        this.toMappingField = toMappingField;
    }

    public String getPrintOrder() {
        return printOrder;
    }

    @XmlElement
    public void setPrintOrder(String printOrder) {
        this.printOrder = printOrder;
    }

    public int getInputLength() {
        return inputLength;
    }

    @XmlElement
    public void setInputLength(int inputLength) {
        this.inputLength = inputLength;
    }

    public boolean isPrintOnApprovalMail() {
        return printOnApprovalMail;
    }

    @XmlElement
    public void setPrintOnApprovalMail(boolean printOnApprovalMail) {
        this.printOnApprovalMail = printOnApprovalMail;
    }

    public boolean isPrintOnOrderMail() {
        return printOnOrderMail;
    }

    @XmlElement
    public void setPrintOnOrderMail(boolean printOnOrderMail) {
        this.printOnOrderMail = printOnOrderMail;
    }

    public boolean isReadOnly() {
        return readOnly;
    }

    @XmlElement
    public void setReadOnly(boolean readOnly) {
        this.readOnly = readOnly;
    }

    public boolean isDoNotShow() {
        return doNotShow;
    }

    @XmlElement
    public void setDoNotShow(boolean doNotShow) {
        this.doNotShow = doNotShow;
    }

    public boolean isKeepAfterAdding() {
        return keepAfterAdding;
    }

    @XmlElement
    public void setKeepAfterAdding(boolean keepAfterAdding) {
        this.keepAfterAdding = keepAfterAdding;
    }

    public String getViewToCall() {
        return viewToCall;
    }

    @XmlElement
    public void setViewToCall(String viewToCall) {
        this.viewToCall = viewToCall;
    }

    @Override
    public String toString() {
        return "ComboBox{" +
                "uniqueId=" + uniqueId +
                ", label='" + label + '\'' +
                ", labelLanguage=" + labelLanguage +
                ", options=" + addedOptions +
                ", toolTips='" + toolTips + '\'' +
                ", labelWidth=" + labelWidth +
                ", labelPosition='" + labelPosition + '\'' +
                ", textStyle='" + textStyle + '\'' +
                ", type='" + type + '\'' +
                ", textSize=" + textSize +
                ", textFormat='" + textFormat + '\'' +
                ", mandatoryInfo=" + mandatoryInfo +
                ", personNumber=" + personNumber +
                ", componentHeight=" + componentHeight +
                ", componentWidth=" + componentWidth +
                ", inMappingDefValue='" + inMappingDefValue + '\'' +
                ", fromMappingField='" + fromMappingField + '\'' +
                ", toMappingField='" + toMappingField + '\'' +
                ", printOrder='" + printOrder + '\'' +
                ", inputLength=" + inputLength +
                ", printOnApprovalMail=" + printOnApprovalMail +
                ", printOnOrderMail=" + printOnOrderMail +
                ", readOnly=" + readOnly +
                ", doNotShow=" + doNotShow +
                ", keepAfterAdding=" + keepAfterAdding +
                ", viewToCall='" + viewToCall + '\'' +
                '}';
    }
}