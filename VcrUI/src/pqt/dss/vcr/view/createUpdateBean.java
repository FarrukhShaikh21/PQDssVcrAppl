package pqt.dss.vcr.view;

import javax.faces.application.FacesMessage;

import javax.faces.context.FacesContext;

import oracle.adf.model.BindingContext;

import oracle.adf.model.binding.DCBindingContainer;

import oracle.adf.model.binding.DCIteratorBinding;

import oracle.adf.view.rich.event.LaunchPopupEvent;

import oracle.adfinternal.view.faces.model.binding.FacesCtrlLOVBinding;

import oracle.binding.BindingContainer;
import oracle.binding.OperationBinding;

public class createUpdateBean {
    public createUpdateBean() {
    }

    public BindingContainer getBindings() {
        return BindingContext.getCurrent().getCurrentBindingsEntry();
    }

    public String b2_action() {
        BindingContainer bindings = getBindings();
                OperationBinding operationBinding = bindings.getOperationBinding("Apply");
                DCBindingContainer dcBindings = (DCBindingContainer) BindingContext.getCurrent().getCurrentBindingsEntry();
                DCIteratorBinding LineVO = (DCIteratorBinding) dcBindings.get("DssVisitingCardReqView1Iterator");

                if (LineVO.getEstimatedRowCount() == 0) {
                    FacesMessage msg =
                        new FacesMessage(FacesMessage.SEVERITY_ERROR,
                                         "Please add Agent detail", "");
                    FacesContext.getCurrentInstance().addMessage(null, msg);
                } else {
                    operationBinding.execute();
                }
                //        Object result = operationBinding.execute();
                //        if (!operationBinding.getErrors().isEmpty()) {
                //            return null;
                //        }
                return null;
            }

    public void agentNoLaunchPopupEvent(LaunchPopupEvent launchPopupEvent) {
        // Add event code here...
        BindingContainer bindings = BindingContext.getCurrent().getCurrentBindingsEntry();
                OperationBinding operation = bindings.getOperationBinding("searchAgent");
                Object VAgentCode = operation.execute(); 
                FacesCtrlLOVBinding lov = (FacesCtrlLOVBinding) bindings.get("AgentCode"); 
                String wcl = "V_AGENT_CODE not in ("+ VAgentCode +")";
                lov.getListIterBinding().getViewObject().setWhereClause(wcl);
    }
}
