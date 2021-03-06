/*
  Copyright (c) 2015, Alcatel-Lucent Inc
  All rights reserved.

  Redistribution and use in source and binary forms, with or without
  modification, are permitted provided that the following conditions are met:
      * Redistributions of source code must retain the above copyright
        notice, this list of conditions and the following disclaimer.
      * Redistributions in binary form must reproduce the above copyright
        notice, this list of conditions and the following disclaimer in the
        documentation and/or other materials provided with the distribution.
      * Neither the name of the copyright holder nor the names of its contributors
        may be used to endorse or promote products derived from this software without
        specific prior written permission.

  THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
  ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
  WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
  DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY
  DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
  (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
  LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
  ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
  (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
  SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
*/

package net.nuagenetworks.vspk.v5_0;

import net.nuagenetworks.bambou.RestObject;
import net.nuagenetworks.bambou.annotation.RestEntity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;



@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "nsginfo", resourceName = "nsginfos")
public class NSGInfo extends RestObject {

   private static final long serialVersionUID = 1L;

   
   
   public enum TPMStatus { DISABLED, ENABLED_NOT_OPERATIONAL, ENABLED_OPERATIONAL, UNKNOWN };
   
   public enum EntityScope { ENTERPRISE, GLOBAL };
   
   public enum Family { ANY, NSG_AMI, NSG_C, NSG_DOCKER, NSG_E, NSG_E200, NSG_E300, NSG_V, NSG_X, NSG_X200 };

   
   @JsonProperty(value = "BIOSReleaseDate")
   protected String BIOSReleaseDate;
   
   @JsonProperty(value = "BIOSVersion")
   protected String BIOSVersion;
   
   @JsonProperty(value = "CPUType")
   protected String CPUType;
   
   @JsonProperty(value = "MACAddress")
   protected String MACAddress;
   
   @JsonProperty(value = "NSGVersion")
   protected String NSGVersion;
   
   @JsonProperty(value = "SKU")
   protected String SKU;
   
   @JsonProperty(value = "TPMStatus")
   protected TPMStatus TPMStatus;
   
   @JsonProperty(value = "TPMVersion")
   protected String TPMVersion;
   
   @JsonProperty(value = "UUID")
   protected String UUID;
   
   @JsonProperty(value = "associatedNSGatewayID")
   protected String associatedNSGatewayID;
   
   @JsonProperty(value = "entityScope")
   protected EntityScope entityScope;
   
   @JsonProperty(value = "externalID")
   protected String externalID;
   
   @JsonProperty(value = "family")
   protected Family family;
   
   @JsonProperty(value = "libraries")
   protected String libraries;
   
   @JsonProperty(value = "patches")
   protected String patches;
   
   @JsonProperty(value = "productName")
   protected String productName;
   
   @JsonProperty(value = "serialNumber")
   protected String serialNumber;
   

   

   public NSGInfo() {
      
   }

   
   @JsonIgnore
   public String getBIOSReleaseDate() {
      return BIOSReleaseDate;
   }

   @JsonIgnore
   public void setBIOSReleaseDate(String value) { 
      this.BIOSReleaseDate = value;
   }
   
   @JsonIgnore
   public String getBIOSVersion() {
      return BIOSVersion;
   }

   @JsonIgnore
   public void setBIOSVersion(String value) { 
      this.BIOSVersion = value;
   }
   
   @JsonIgnore
   public String getCPUType() {
      return CPUType;
   }

   @JsonIgnore
   public void setCPUType(String value) { 
      this.CPUType = value;
   }
   
   @JsonIgnore
   public String getMACAddress() {
      return MACAddress;
   }

   @JsonIgnore
   public void setMACAddress(String value) { 
      this.MACAddress = value;
   }
   
   @JsonIgnore
   public String getNSGVersion() {
      return NSGVersion;
   }

   @JsonIgnore
   public void setNSGVersion(String value) { 
      this.NSGVersion = value;
   }
   
   @JsonIgnore
   public String getSKU() {
      return SKU;
   }

   @JsonIgnore
   public void setSKU(String value) { 
      this.SKU = value;
   }
   
   @JsonIgnore
   public TPMStatus getTPMStatus() {
      return TPMStatus;
   }

   @JsonIgnore
   public void setTPMStatus(TPMStatus value) { 
      this.TPMStatus = value;
   }
   
   @JsonIgnore
   public String getTPMVersion() {
      return TPMVersion;
   }

   @JsonIgnore
   public void setTPMVersion(String value) { 
      this.TPMVersion = value;
   }
   
   @JsonIgnore
   public String getUUID() {
      return UUID;
   }

   @JsonIgnore
   public void setUUID(String value) { 
      this.UUID = value;
   }
   
   @JsonIgnore
   public String getAssociatedNSGatewayID() {
      return associatedNSGatewayID;
   }

   @JsonIgnore
   public void setAssociatedNSGatewayID(String value) { 
      this.associatedNSGatewayID = value;
   }
   
   @JsonIgnore
   public EntityScope getEntityScope() {
      return entityScope;
   }

   @JsonIgnore
   public void setEntityScope(EntityScope value) { 
      this.entityScope = value;
   }
   
   @JsonIgnore
   public String getExternalID() {
      return externalID;
   }

   @JsonIgnore
   public void setExternalID(String value) { 
      this.externalID = value;
   }
   
   @JsonIgnore
   public Family getFamily() {
      return family;
   }

   @JsonIgnore
   public void setFamily(Family value) { 
      this.family = value;
   }
   
   @JsonIgnore
   public String getLibraries() {
      return libraries;
   }

   @JsonIgnore
   public void setLibraries(String value) { 
      this.libraries = value;
   }
   
   @JsonIgnore
   public String getPatches() {
      return patches;
   }

   @JsonIgnore
   public void setPatches(String value) { 
      this.patches = value;
   }
   
   @JsonIgnore
   public String getProductName() {
      return productName;
   }

   @JsonIgnore
   public void setProductName(String value) { 
      this.productName = value;
   }
   
   @JsonIgnore
   public String getSerialNumber() {
      return serialNumber;
   }

   @JsonIgnore
   public void setSerialNumber(String value) { 
      this.serialNumber = value;
   }
   

   

   public String toString() {
      return "NSGInfo [" + "BIOSReleaseDate=" + BIOSReleaseDate + ", BIOSVersion=" + BIOSVersion + ", CPUType=" + CPUType + ", MACAddress=" + MACAddress + ", NSGVersion=" + NSGVersion + ", SKU=" + SKU + ", TPMStatus=" + TPMStatus + ", TPMVersion=" + TPMVersion + ", UUID=" + UUID + ", associatedNSGatewayID=" + associatedNSGatewayID + ", entityScope=" + entityScope + ", externalID=" + externalID + ", family=" + family + ", libraries=" + libraries + ", patches=" + patches + ", productName=" + productName + ", serialNumber=" + serialNumber + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
              + lastUpdatedDate + ", owner=" + owner  + "]";
   }
   
   
}