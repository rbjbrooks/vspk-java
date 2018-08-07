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


import net.nuagenetworks.vspk.v5_0.fetchers.AlarmsFetcher;
import net.nuagenetworks.vspk.v5_0.fetchers.GlobalMetadatasFetcher;
import net.nuagenetworks.vspk.v5_0.fetchers.MetadatasFetcher;
import net.nuagenetworks.vspk.v5_0.fetchers.PerformanceMonitorsFetcher;
import net.nuagenetworks.vspk.v5_0.fetchers.SubnetsFetcher;

@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "ikegatewayconnection", resourceName = "ikegatewayconnections")
public class IKEGatewayConnection extends RestObject {

   private static final long serialVersionUID = 1L;

   
   
   public enum NSGIdentifierType { ID_DER_ASN1_DN, ID_FQDN, ID_IPV4_ADDR, ID_KEY_ID, ID_RFC822_ADDR };
   
   public enum NSGRole { INITIATOR, RESPONDER };
   
   public enum AssociatedIKEAuthenticationType { IKE_CERTIFICATE, IKE_PSK };
   
   public enum EntityScope { ENTERPRISE, GLOBAL };

   
   @JsonProperty(value = "NSGIdentifier")
   protected String NSGIdentifier;
   
   @JsonProperty(value = "NSGIdentifierType")
   protected NSGIdentifierType NSGIdentifierType;
   
   @JsonProperty(value = "NSGRole")
   protected NSGRole NSGRole;
   
   @JsonProperty(value = "allowAnySubnet")
   protected Boolean allowAnySubnet;
   
   @JsonProperty(value = "associatedIKEAuthenticationID")
   protected String associatedIKEAuthenticationID;
   
   @JsonProperty(value = "associatedIKEAuthenticationType")
   protected AssociatedIKEAuthenticationType associatedIKEAuthenticationType;
   
   @JsonProperty(value = "associatedIKEEncryptionProfileID")
   protected String associatedIKEEncryptionProfileID;
   
   @JsonProperty(value = "associatedIKEGatewayProfileID")
   protected String associatedIKEGatewayProfileID;
   
   @JsonProperty(value = "associatedVLANID")
   protected String associatedVLANID;
   
   @JsonProperty(value = "entityScope")
   protected EntityScope entityScope;
   
   @JsonProperty(value = "externalID")
   protected String externalID;
   
   @JsonProperty(value = "lastUpdatedBy")
   protected String lastUpdatedBy;
   
   @JsonProperty(value = "mark")
   protected Long mark;
   
   @JsonProperty(value = "name")
   protected String name;
   
   @JsonProperty(value = "portVLANName")
   protected String portVLANName;
   
   @JsonProperty(value = "priority")
   protected Long priority;
   
   @JsonProperty(value = "sequence")
   protected Long sequence;
   
   @JsonProperty(value = "unencryptedPSK")
   protected String unencryptedPSK;
   

   
   @JsonIgnore
   private AlarmsFetcher alarms;
   
   @JsonIgnore
   private GlobalMetadatasFetcher globalMetadatas;
   
   @JsonIgnore
   private MetadatasFetcher metadatas;
   
   @JsonIgnore
   private PerformanceMonitorsFetcher performanceMonitors;
   
   @JsonIgnore
   private SubnetsFetcher subnets;
   

   public IKEGatewayConnection() {
      
      alarms = new AlarmsFetcher(this);
      
      globalMetadatas = new GlobalMetadatasFetcher(this);
      
      metadatas = new MetadatasFetcher(this);
      
      performanceMonitors = new PerformanceMonitorsFetcher(this);
      
      subnets = new SubnetsFetcher(this);
      
   }

   
   @JsonIgnore
   public String getNSGIdentifier() {
      return NSGIdentifier;
   }

   @JsonIgnore
   public void setNSGIdentifier(String value) { 
      this.NSGIdentifier = value;
   }
   
   @JsonIgnore
   public NSGIdentifierType getNSGIdentifierType() {
      return NSGIdentifierType;
   }

   @JsonIgnore
   public void setNSGIdentifierType(NSGIdentifierType value) { 
      this.NSGIdentifierType = value;
   }
   
   @JsonIgnore
   public NSGRole getNSGRole() {
      return NSGRole;
   }

   @JsonIgnore
   public void setNSGRole(NSGRole value) { 
      this.NSGRole = value;
   }
   
   @JsonIgnore
   public Boolean getAllowAnySubnet() {
      return allowAnySubnet;
   }

   @JsonIgnore
   public void setAllowAnySubnet(Boolean value) { 
      this.allowAnySubnet = value;
   }
   
   @JsonIgnore
   public String getAssociatedIKEAuthenticationID() {
      return associatedIKEAuthenticationID;
   }

   @JsonIgnore
   public void setAssociatedIKEAuthenticationID(String value) { 
      this.associatedIKEAuthenticationID = value;
   }
   
   @JsonIgnore
   public AssociatedIKEAuthenticationType getAssociatedIKEAuthenticationType() {
      return associatedIKEAuthenticationType;
   }

   @JsonIgnore
   public void setAssociatedIKEAuthenticationType(AssociatedIKEAuthenticationType value) { 
      this.associatedIKEAuthenticationType = value;
   }
   
   @JsonIgnore
   public String getAssociatedIKEEncryptionProfileID() {
      return associatedIKEEncryptionProfileID;
   }

   @JsonIgnore
   public void setAssociatedIKEEncryptionProfileID(String value) { 
      this.associatedIKEEncryptionProfileID = value;
   }
   
   @JsonIgnore
   public String getAssociatedIKEGatewayProfileID() {
      return associatedIKEGatewayProfileID;
   }

   @JsonIgnore
   public void setAssociatedIKEGatewayProfileID(String value) { 
      this.associatedIKEGatewayProfileID = value;
   }
   
   @JsonIgnore
   public String getAssociatedVLANID() {
      return associatedVLANID;
   }

   @JsonIgnore
   public void setAssociatedVLANID(String value) { 
      this.associatedVLANID = value;
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
   public String getLastUpdatedBy() {
      return lastUpdatedBy;
   }

   @JsonIgnore
   public void setLastUpdatedBy(String value) { 
      this.lastUpdatedBy = value;
   }
   
   @JsonIgnore
   public Long getMark() {
      return mark;
   }

   @JsonIgnore
   public void setMark(Long value) { 
      this.mark = value;
   }
   
   @JsonIgnore
   public String getName() {
      return name;
   }

   @JsonIgnore
   public void setName(String value) { 
      this.name = value;
   }
   
   @JsonIgnore
   public String getPortVLANName() {
      return portVLANName;
   }

   @JsonIgnore
   public void setPortVLANName(String value) { 
      this.portVLANName = value;
   }
   
   @JsonIgnore
   public Long getPriority() {
      return priority;
   }

   @JsonIgnore
   public void setPriority(Long value) { 
      this.priority = value;
   }
   
   @JsonIgnore
   public Long getSequence() {
      return sequence;
   }

   @JsonIgnore
   public void setSequence(Long value) { 
      this.sequence = value;
   }
   
   @JsonIgnore
   public String getUnencryptedPSK() {
      return unencryptedPSK;
   }

   @JsonIgnore
   public void setUnencryptedPSK(String value) { 
      this.unencryptedPSK = value;
   }
   

   
   @JsonIgnore
   public AlarmsFetcher getAlarms() {
      return alarms;
   }
   
   @JsonIgnore
   public GlobalMetadatasFetcher getGlobalMetadatas() {
      return globalMetadatas;
   }
   
   @JsonIgnore
   public MetadatasFetcher getMetadatas() {
      return metadatas;
   }
   
   @JsonIgnore
   public PerformanceMonitorsFetcher getPerformanceMonitors() {
      return performanceMonitors;
   }
   
   @JsonIgnore
   public SubnetsFetcher getSubnets() {
      return subnets;
   }
   

   public String toString() {
      return "IKEGatewayConnection [" + "NSGIdentifier=" + NSGIdentifier + ", NSGIdentifierType=" + NSGIdentifierType + ", NSGRole=" + NSGRole + ", allowAnySubnet=" + allowAnySubnet + ", associatedIKEAuthenticationID=" + associatedIKEAuthenticationID + ", associatedIKEAuthenticationType=" + associatedIKEAuthenticationType + ", associatedIKEEncryptionProfileID=" + associatedIKEEncryptionProfileID + ", associatedIKEGatewayProfileID=" + associatedIKEGatewayProfileID + ", associatedVLANID=" + associatedVLANID + ", entityScope=" + entityScope + ", externalID=" + externalID + ", lastUpdatedBy=" + lastUpdatedBy + ", mark=" + mark + ", name=" + name + ", portVLANName=" + portVLANName + ", priority=" + priority + ", sequence=" + sequence + ", unencryptedPSK=" + unencryptedPSK + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
              + lastUpdatedDate + ", owner=" + owner  + "]";
   }
   
   
}