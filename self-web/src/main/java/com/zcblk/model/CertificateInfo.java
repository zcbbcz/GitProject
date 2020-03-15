package com.zcblk.model;

import java.util.Date;

public class CertificateInfo {
    private Integer id;

    private Integer resumeInfoId;

    private Date acquisitionTime;

    private String certificateName;

    private Byte certificateLeve;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getResumeInfoId() {
        return resumeInfoId;
    }

    public void setResumeInfoId(Integer resumeInfoId) {
        this.resumeInfoId = resumeInfoId;
    }

    public Date getAcquisitionTime() {
        return acquisitionTime;
    }

    public void setAcquisitionTime(Date acquisitionTime) {
        this.acquisitionTime = acquisitionTime;
    }

    public String getCertificateName() {
        return certificateName;
    }

    public void setCertificateName(String certificateName) {
        this.certificateName = certificateName == null ? null : certificateName.trim();
    }

    public Byte getCertificateLeve() {
        return certificateLeve;
    }

    public void setCertificateLeve(Byte certificateLeve) {
        this.certificateLeve = certificateLeve;
    }
}