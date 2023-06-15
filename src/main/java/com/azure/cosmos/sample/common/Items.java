package com.azure.cosmos.sample.common;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;

@Getter
@Setter
@ToString
@JsonFormat(with = JsonFormat.Feature.ACCEPT_CASE_INSENSITIVE_PROPERTIES)
public class Items {

    public String getId() {
        return HBASE_ROW_KEY;
    }    
    private String HBASE_ROW_KEY;
    private String POS_DT;
    private String AR_ID;
    private String DOMC_BR_NO;
    private String KBNK_IDY_CL_CD;
    private String TXN_SEQ;
    private String FNC_TP;
    private String SVC_BR_NO;
    private String TXN_YEAR;
    private String TXN_DT;
    private String TXN_TM;
    private String TXN_VAL_DT;
    private String MNMC_CD;
    private String TXN_CD;
    private String OPRN_TP_CD;
    private String OPRN_CD;
    private String SUB_OPRN_CD;
    private String TXN_DSC_TH;
    private String TXN_DSC_EN;
    private String DB_AMT;
    private String CD_AMT;
    private String OTSND_BAL;
    private String CHK_NO;
    private String SRC_USR_ID;
    private String AHRZD_LVL;
    private String ORIG_SRC_STM_ID;
    private String PD_SRL_NO;
    private String FM_TO_AR_ID;
    private String PYMT_F;
    private String ORIG_RQUID;
    private String TXN_GRP_ID;
    private String FUTR_DT_F;
    private String INR_TXN_CD;
    private String KBANK_TXN_CD;
    private String TXN_CD_DSC_TH;
    private String TXN_CD_DSC_EN;
    private String CNL_DSC_TH;
    private String CNL_DSC_EN;
    private String OTSND_BAL_BY_ENTR_DT;
}
