package pqt.dss.vcr.model.vo;

import oracle.jbo.ViewCriteria;
import oracle.jbo.ViewObject;
import oracle.jbo.domain.Number;
import oracle.jbo.server.ViewObjectImpl;

import pqt.dss.vcr.model.vo.common.DssVisitingCardReqView;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Thu Oct 20 11:42:28 PKT 2016
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class DssVisitingCardReqViewImpl extends ViewObjectImpl implements DssVisitingCardReqView {
    /**
     * This is the default constructor (do not remove).
     */
    public DssVisitingCardReqViewImpl() {
    }

    /**
     * Returns the variable value for VC_Agent_Cell_No.
     * @return variable value for VC_Agent_Cell_No
     */
    public String getVC_Agent_Cell_No() {
        return (String) ensureVariableManager().getVariableValue("VC_Agent_Cell_No");
    }

    /**
     * Sets <code>value</code> for variable VC_Agent_Cell_No.
     * @param value value to bind as VC_Agent_Cell_No
     */
    public void setVC_Agent_Cell_No(String value) {
        ensureVariableManager().setVariableValue("VC_Agent_Cell_No", value);
    }

    /**
     * Returns the variable value for NVC_wfDocumentId.
     * @return variable value for NVC_wfDocumentId
     */
    public Number getNVC_wfDocumentId() {
        return (Number) ensureVariableManager().getVariableValue("NVC_wfDocumentId");
    }

    /**
     * Sets <code>value</code> for variable NVC_wfDocumentId.
     * @param value value to bind as NVC_wfDocumentId
     */
    public void setNVC_wfDocumentId(Number value) {
        ensureVariableManager().setVariableValue("NVC_wfDocumentId", value);
        this.exeViewCrieteria(value);
    }
    public void exeViewCrieteria(Number val) {
            ViewObject vo = this.getViewObject();
            ViewCriteria vc = this.getViewCriteria("NotificationViewCriteria");
            vo.applyViewCriteria(vc);
            vo.setNamedWhereClauseParam("NVC_wfDocumentId", val);
            vo.executeQuery();
        }
}

