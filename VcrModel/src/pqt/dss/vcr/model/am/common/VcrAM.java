package pqt.dss.vcr.model.am.common;

import oracle.jbo.ApplicationModule;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Tue Oct 04 21:12:01 PKT 2016
// ---------------------------------------------------------------------
public interface VcrAM extends ApplicationModule {
    void Apply();

    void DeleteCommit();

    void DssApprove();

    void callWorkflow(oracle.jbo.domain.Number p_document_id, String ApprovalType);

    String searchAgent();

    void CallVCRWorkflow(oracle.jbo.domain.Number p_document_id);
}

