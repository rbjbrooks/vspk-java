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
@RestEntity(restName = "nsgatewayssummary", resourceName = "nsgatewayssummaries")
public class NSGatewaySummary extends RestObject {

   private static final long serialVersionUID = 1L;

   
   
   public enum BootstrapStatus { ACTIVE, CERTIFICATE_REQUIRED, INACTIVE, NOTIFICATION_APP_REQ_ACK, NOTIFICATION_APP_REQ_SENT };

   
   @JsonProperty(value = "address")
   protected String address;
   
   @JsonProperty(value = "bootstrapStatus")
   protected BootstrapStatus bootstrapStatus;
   
   @JsonProperty(value = "country")
   protected String country;
   
   @JsonProperty(value = "criticalAlarmsCount")
   protected Long criticalAlarmsCount;
   
   @JsonProperty(value = "enterpriseID")
   protected String enterpriseID;
   
   @JsonProperty(value = "gatewayID")
   protected String gatewayID;
   
   @JsonProperty(value = "gatewayName")
   protected String gatewayName;
   
   @JsonProperty(value = "infoAlarmsCount")
   protected String infoAlarmsCount;
   
   @JsonProperty(value = "latitude")
   protected Float latitude;
   
   @JsonProperty(value = "locality")
   protected String locality;
   
   @JsonProperty(value = "longitude")
   protected Float longitude;
   
   @JsonProperty(value = "majorAlarmsCount")
   protected Long majorAlarmsCount;
   
   @JsonProperty(value = "minorAlarmsCount")
   protected Long minorAlarmsCount;
   
   @JsonProperty(value = "nsgVersion")
   protected String nsgVersion;
   
   @JsonProperty(value = "state")
   protected String state;
   
   @JsonProperty(value = "systemID")
   protected String systemID;
   
   @JsonProperty(value = "timeZoneID")
   protected String timeZoneID;
   

   

   public NSGatewaySummary() {
      
   }

   
   @JsonIgnore
   public String getAddress() {
      return address;
   }

   @JsonIgnore
   public void setAddress(String value) { 
      this.address = value;
   }
   
   @JsonIgnore
   public BootstrapStatus getBootstrapStatus() {
      return bootstrapStatus;
   }

   @JsonIgnore
   public void setBootstrapStatus(BootstrapStatus value) { 
      this.bootstrapStatus = value;
   }
   
   @JsonIgnore
   public String getCountry() {
      return country;
   }

   @JsonIgnore
   public void setCountry(String value) { 
      this.country = value;
   }
   
   @JsonIgnore
   public Long getCriticalAlarmsCount() {
      return criticalAlarmsCount;
   }

   @JsonIgnore
   public void setCriticalAlarmsCount(Long value) { 
      this.criticalAlarmsCount = value;
   }
   
   @JsonIgnore
   public String getEnterpriseID() {
      return enterpriseID;
   }

   @JsonIgnore
   public void setEnterpriseID(String value) { 
      this.enterpriseID = value;
   }
   
   @JsonIgnore
   public String getGatewayID() {
      return gatewayID;
   }

   @JsonIgnore
   public void setGatewayID(String value) { 
      this.gatewayID = value;
   }
   
   @JsonIgnore
   public String getGatewayName() {
      return gatewayName;
   }

   @JsonIgnore
   public void setGatewayName(String value) { 
      this.gatewayName = value;
   }
   
   @JsonIgnore
   public String getInfoAlarmsCount() {
      return infoAlarmsCount;
   }

   @JsonIgnore
   public void setInfoAlarmsCount(String value) { 
      this.infoAlarmsCount = value;
   }
   
   @JsonIgnore
   public Float getLatitude() {
      return latitude;
   }

   @JsonIgnore
   public void setLatitude(Float value) { 
      this.latitude = value;
   }
   
   @JsonIgnore
   public String getLocality() {
      return locality;
   }

   @JsonIgnore
   public void setLocality(String value) { 
      this.locality = value;
   }
   
   @JsonIgnore
   public Float getLongitude() {
      return longitude;
   }

   @JsonIgnore
   public void setLongitude(Float value) { 
      this.longitude = value;
   }
   
   @JsonIgnore
   public Long getMajorAlarmsCount() {
      return majorAlarmsCount;
   }

   @JsonIgnore
   public void setMajorAlarmsCount(Long value) { 
      this.majorAlarmsCount = value;
   }
   
   @JsonIgnore
   public Long getMinorAlarmsCount() {
      return minorAlarmsCount;
   }

   @JsonIgnore
   public void setMinorAlarmsCount(Long value) { 
      this.minorAlarmsCount = value;
   }
   
   @JsonIgnore
   public String getNsgVersion() {
      return nsgVersion;
   }

   @JsonIgnore
   public void setNsgVersion(String value) { 
      this.nsgVersion = value;
   }
   
   @JsonIgnore
   public String getState() {
      return state;
   }

   @JsonIgnore
   public void setState(String value) { 
      this.state = value;
   }
   
   @JsonIgnore
   public String getSystemID() {
      return systemID;
   }

   @JsonIgnore
   public void setSystemID(String value) { 
      this.systemID = value;
   }
   
   @JsonIgnore
   public String getTimeZoneID() {
      return timeZoneID;
   }

   @JsonIgnore
   public void setTimeZoneID(String value) { 
      this.timeZoneID = value;
   }
   

   

   public String toString() {
      return "NSGatewaySummary [" + "address=" + address + ", bootstrapStatus=" + bootstrapStatus + ", country=" + country + ", criticalAlarmsCount=" + criticalAlarmsCount + ", enterpriseID=" + enterpriseID + ", gatewayID=" + gatewayID + ", gatewayName=" + gatewayName + ", infoAlarmsCount=" + infoAlarmsCount + ", latitude=" + latitude + ", locality=" + locality + ", longitude=" + longitude + ", majorAlarmsCount=" + majorAlarmsCount + ", minorAlarmsCount=" + minorAlarmsCount + ", nsgVersion=" + nsgVersion + ", state=" + state + ", systemID=" + systemID + ", timeZoneID=" + timeZoneID + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
              + lastUpdatedDate + ", owner=" + owner  + "]";
   }
   
   
}