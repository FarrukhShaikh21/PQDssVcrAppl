package pqt.dss.vcr.view;

import javax.faces.application.FacesMessage;

import javax.faces.context.FacesContext;

import oracle.adf.model.BindingContext;
import oracle.adf.model.binding.DCBindingContainer;
import oracle.adf.view.rich.component.rich.data.RichTable;
import oracle.adf.view.rich.component.rich.input.RichInputListOfValues;
import oracle.adf.view.rich.component.rich.input.RichInputText;
import oracle.adf.view.rich.component.rich.layout.RichPanelFormLayout;
import oracle.adf.view.rich.component.rich.layout.RichPanelGroupLayout;
import oracle.adf.view.rich.component.rich.layout.RichPanelHeader;
import oracle.adf.view.rich.component.rich.layout.RichPanelLabelAndMessage;
import oracle.adf.view.rich.component.rich.layout.RichPanelStretchLayout;
import oracle.adf.view.rich.component.rich.layout.RichToolbar;
import oracle.adf.view.rich.component.rich.nav.RichButton;
import oracle.adf.view.rich.component.rich.output.RichOutputText;
import oracle.adf.view.rich.component.rich.output.RichPanelCollection;
import oracle.adf.view.rich.component.rich.output.RichSeparator;

import oracle.binding.AttributeBinding;
import oracle.binding.BindingContainer;

import oracle.binding.OperationBinding;

import oracle.jbo.JboException;

import org.apache.myfaces.trinidad.component.UIXGroup;

public class vcrDetailClass {
    private RichTable t1;
    private UIXGroup g1;
    private RichToolbar t2;
    private RichPanelCollection pc1;
    private RichSeparator s1;
    private RichPanelGroupLayout pgl1;
    private RichButton b2;
    private RichButton b1;
    private UIXGroup g2;
    private RichToolbar t3;
    private RichPanelHeader ph1;
    private RichPanelStretchLayout psl1;
    private RichPanelFormLayout pfl1;
    private RichInputListOfValues branchNameId;
    private RichInputText it8;
    private RichPanelLabelAndMessage plam3;
    private RichOutputText ot3;
    private RichInputText it10;

    public vcrDetailClass() {
    }
    public String Branch_action() {
           // Add event code here...
           BindingContainer bindings = BindingContext.getCurrent().getCurrentBindingsEntry();
           OperationBinding operation = bindings.getOperationBinding("callWorkflow");
           operation.getParamsMap().put("p_document_id", getAttributeValue("VisitingCardReqIdPk"));
           operation.getParamsMap().put("ApprovalType", "BRANCH");
           Object result = operation.execute();
           if (!operation.getErrors().isEmpty()) {
               JboException ex = new JboException("Some thing went wrong while sending Notification.");
               BindingContext bctx = BindingContext.getCurrent();
               ((DCBindingContainer) bctx.getCurrentBindingsEntry()).reportException(ex);
           }

           this.SendMessage();
           return "backQuery";
       }

       public Object getAttributeValue(String AttrName) {
           BindingContainer bdCont = BindingContext.getCurrent().getCurrentBindingsEntry();
           AttributeBinding val = (AttributeBinding) bdCont.getControlBinding(AttrName);
           return val.getInputValue();
       }
       public String DSS_action() {
           BindingContainer bindings = BindingContext.getCurrent().getCurrentBindingsEntry();
           OperationBinding operation = bindings.getOperationBinding("callWorkflow");
           operation.getParamsMap().put("p_document_id", getAttributeValue("VisitingCardReqIdPk"));
           operation.getParamsMap().put("ApprovalType", "DSS");
           Object result = operation.execute();
           if (!operation.getErrors().isEmpty()) {
               JboException ex = new JboException("Some thing went wrong while sending Notification.");
               BindingContext bctx = BindingContext.getCurrent();
               ((DCBindingContainer) bctx.getCurrentBindingsEntry()).reportException(ex);
           }

           this.SendMessage();
           return "backQuery";
       }
       public String Approve_action() {
           BindingContainer bindings = BindingContext.getCurrent().getCurrentBindingsEntry();
           OperationBinding operation = bindings.getOperationBinding("DssApprove");
           operation.execute();
      this.SendMessage();
           return "backQuery";
       }
       public void SendMessage() {
              FacesMessage Message = new FacesMessage("Workflow has been submitted successfully!");
              Message.setSeverity(FacesMessage.SEVERITY_INFO);
              FacesContext fc = FacesContext.getCurrentInstance();
              fc.addMessage(null, Message);
       }

    public void setT1(RichTable t1) {
        this.t1 = t1;
    }

    public RichTable getT1() {
        return t1;
    }

    public void setG1(UIXGroup g1) {
        this.g1 = g1;
    }

    public UIXGroup getG1() {
        return g1;
    }

    public void setT2(RichToolbar t2) {
        this.t2 = t2;
    }

    public RichToolbar getT2() {
        return t2;
    }

    public void setPc1(RichPanelCollection pc1) {
        this.pc1 = pc1;
    }

    public RichPanelCollection getPc1() {
        return pc1;
    }

    public void setS1(RichSeparator s1) {
        this.s1 = s1;
    }

    public RichSeparator getS1() {
        return s1;
    }


    public void setPgl1(RichPanelGroupLayout pgl1) {
        this.pgl1 = pgl1;
    }

    public RichPanelGroupLayout getPgl1() {
        return pgl1;
    }


    public void setB2(RichButton b2) {
        this.b2 = b2;
    }

    public RichButton getB2() {
        return b2;
    }

    public void setB1(RichButton b1) {
        this.b1 = b1;
    }

    public RichButton getB1() {
        return b1;
    }

    public void setG2(UIXGroup g2) {
        this.g2 = g2;
    }

    public UIXGroup getG2() {
        return g2;
    }

    public void setT3(RichToolbar t3) {
        this.t3 = t3;
    }

    public RichToolbar getT3() {
        return t3;
    }

    public void setPh1(RichPanelHeader ph1) {
        this.ph1 = ph1;
    }

    public RichPanelHeader getPh1() {
        return ph1;
    }

    public void setPsl1(RichPanelStretchLayout psl1) {
        this.psl1 = psl1;
    }

    public RichPanelStretchLayout getPsl1() {
        return psl1;
    }


    public void setPfl1(RichPanelFormLayout pfl1) {
        this.pfl1 = pfl1;
    }

    public RichPanelFormLayout getPfl1() {
        return pfl1;
    }

    public void setBranchNameId(RichInputListOfValues branchNameId) {
        this.branchNameId = branchNameId;
    }

    public RichInputListOfValues getBranchNameId() {
        return branchNameId;
    }

    public void setIt8(RichInputText it8) {
        this.it8 = it8;
    }

    public RichInputText getIt8() {
        return it8;
    }

    public void setPlam3(RichPanelLabelAndMessage plam3) {
        this.plam3 = plam3;
    }

    public RichPanelLabelAndMessage getPlam3() {
        return plam3;
    }

    public void setOt3(RichOutputText ot3) {
        this.ot3 = ot3;
    }

    public RichOutputText getOt3() {
        return ot3;
    }
    public String SubmitForApproval() {
        // Add event code here...
        BindingContainer bindings = BindingContext.getCurrent().getCurrentBindingsEntry();
        OperationBinding operation = bindings.getOperationBinding("CallVCRWorkflow");
        operation.getParamsMap().put("p_document_id", getAttributeValue("VcrHdrIdPk"));
        operation.execute();

        return "backQuery";
    }

    public void setIt10(RichInputText it10) {
        this.it10 = it10;
    }

    public RichInputText getIt10() {
        return it10;
    }
}
