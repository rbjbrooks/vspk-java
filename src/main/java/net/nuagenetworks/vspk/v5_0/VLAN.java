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
import net.nuagenetworks.vspk.v5_0.fetchers.BGPNeighborsFetcher;
import net.nuagenetworks.vspk.v5_0.fetchers.BRConnectionsFetcher;
import net.nuagenetworks.vspk.v5_0.fetchers.EnterprisePermissionsFetcher;
import net.nuagenetworks.vspk.v5_0.fetchers.EventLogsFetcher;
import net.nuagenetworks.vspk.v5_0.fetchers.GlobalMetadatasFetcher;
import net.nuagenetworks.vspk.v5_0.fetchers.IKEGatewayConnectionsFetcher;
import net.nuagenetworks.vspk.v5_0.fetchers.LtestatisticsFetcher;
import net.nuagenetworks.vspk.v5_0.fetchers.MetadatasFetcher;
import net.nuagenetworks.vspk.v5_0.fetchers.PATNATPoolsFetcher;
import net.nuagenetworks.vspk.v5_0.fetchers.PermissionsFetcher;
import net.nuagenetworks.vspk.v5_0.fetchers.StatisticsFetcher;
import net.nuagenetworks.vspk.v5_0.fetchers.UplinkConnectionsFetcher;

@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "vlan", resourceName = "vlans")
public class VLAN extends RestObject {

   private static final long serialVersionUID = 1L;

   
   
   public enum AssociatedConnectionType { BR_CONNECTION, UPLINK_CONNECTION };
   
   public enum EntityScope { ENTERPRISE, GLOBAL };
   
   public enum PermittedAction { ALL, DEPLOY, EXTEND, INSTANTIATE, READ, USE };
   
   public enum Status { INITIALIZED, MISMATCH, ORPHAN, READY };
   
   public enum Type { ACCESS, BR, DUC, UPLINK };

   
   @JsonProperty(value = "associatedBGPProfileID")
   protected String associatedBGPProfileID;
   
   @JsonProperty(value = "associatedConnectionType")
   protected AssociatedConnectionType associatedConnectionType;
   
   @JsonProperty(value = "associatedEgressQOSPolicyID")
   protected String associatedEgressQOSPolicyID;
   
   @JsonProperty(value = "associatedIngressOverlayQoSPolicerID")
   protected String associatedIngressOverlayQoSPolicerID;
   
   @JsonProperty(value = "associatedIngressQOSPolicyID")
   protected String associatedIngressQOSPolicyID;
   
   @JsonProperty(value = "associatedIngressUnderlayQoSPolicerID")
   protected String associatedIngressUnderlayQoSPolicerID;
   
   @JsonProperty(value = "associatedUplinkConnectionID")
   protected String associatedUplinkConnectionID;
   
   @JsonProperty(value = "associatedVSCProfileID")
   protected String associatedVSCProfileID;
   
   @JsonProperty(value = "description")
   protected String description;
   
   @JsonProperty(value = "ducVlan")
   protected Boolean ducVlan;
   
   @JsonProperty(value = "entityScope")
   protected EntityScope entityScope;
   
   @JsonProperty(value = "externalID")
   protected String externalID;
   
   @JsonProperty(value = "gatewayID")
   protected String gatewayID;
   
   @JsonProperty(value = "isUplink")
   protected Boolean isUplink;
   
   @JsonProperty(value = "lastUpdatedBy")
   protected String lastUpdatedBy;
   
   @JsonProperty(value = "permittedAction")
   protected PermittedAction permittedAction;
   
   @JsonProperty(value = "readonly")
   protected Boolean readonly;
   
   @JsonProperty(value = "restricted")
   protected Boolean restricted;
   
   @JsonProperty(value = "status")
   protected Status status;
   
   @JsonProperty(value = "templateID")
   protected String templateID;
   
   @JsonProperty(value = "type")
   protected Type type;
   
   @JsonProperty(value = "useUserMnemonic")
   protected Boolean useUserMnemonic;
   
   @JsonProperty(value = "userMnemonic")
   protected String userMnemonic;
   
   @JsonProperty(value = "value")
   protected Long value;
   
   @JsonProperty(value = "vportID")
   protected String vportID;
   

   
   @JsonIgnore
   private AlarmsFetcher alarms;
   
   @JsonIgnore
   private BGPNeighborsFetcher bGPNeighbors;
   
   @JsonIgnore
   private BRConnectionsFetcher bRConnections;
   
   @JsonIgnore
   private EnterprisePermissionsFetcher enterprisePermissions;
   
   @JsonIgnore
   private EventLogsFetcher eventLogs;
   
   @JsonIgnore
   private GlobalMetadatasFetcher globalMetadatas;
   
   @JsonIgnore
   private IKEGatewayConnectionsFetcher iKEGatewayConnections;
   
   @JsonIgnore
   private LtestatisticsFetcher ltestatistics;
   
   @JsonIgnore
   private MetadatasFetcher metadatas;
   
   @JsonIgnore
   private PATNATPoolsFetcher pATNATPools;
   
   @JsonIgnore
   private PermissionsFetcher permissions;
   
   @JsonIgnore
   private StatisticsFetcher statistics;
   
   @JsonIgnore
   private UplinkConnectionsFetcher uplinkConnections;
   

   public VLAN() {
      
      alarms = new AlarmsFetcher(this);
      
      bGPNeighbors = new BGPNeighborsFetcher(this);
      
      bRConnections = new BRConnectionsFetcher(this);
      
      enterprisePermissions = new EnterprisePermissionsFetcher(this);
      
      eventLogs = new EventLogsFetcher(this);
      
      globalMetadatas = new GlobalMetadatasFetcher(this);
      
      iKEGatewayConnections = new IKEGatewayConnectionsFetcher(this);
      
      ltestatistics = new LtestatisticsFetcher(this);
      
      metadatas = new MetadatasFetcher(this);
      
      pATNATPools = new PATNATPoolsFetcher(this);
      
      permissions = new PermissionsFetcher(this);
      
      statistics = new StatisticsFetcher(this);
      
      uplinkConnections = new UplinkConnectionsFetcher(this);
      
   }

   
   @JsonIgnore
   public String getAssociatedBGPProfileID() {
      return associatedBGPProfileID;
   }

   @JsonIgnore
   public void setAssociatedBGPProfileID(String value) { 
      this.associatedBGPProfileID = value;
   }
   
   @JsonIgnore
   public AssociatedConnectionType getAssociatedConnectionType() {
      return associatedConnectionType;
   }

   @JsonIgnore
   public void setAssociatedConnectionType(AssociatedConnectionType value) { 
      this.associatedConnectionType = value;
   }
   
   @JsonIgnore
   public String getAssociatedEgressQOSPolicyID() {
      return associatedEgressQOSPolicyID;
   }

   @JsonIgnore
   public void setAssociatedEgressQOSPolicyID(String value) { 
      this.associatedEgressQOSPolicyID = value;
   }
   
   @JsonIgnore
   public String getAssociatedIngressOverlayQoSPolicerID() {
      return associatedIngressOverlayQoSPolicerID;
   }

   @JsonIgnore
   public void setAssociatedIngressOverlayQoSPolicerID(String value) { 
      this.associatedIngressOverlayQoSPolicerID = value;
   }
   
   @JsonIgnore
   public String getAssociatedIngressQOSPolicyID() {
      return associatedIngressQOSPolicyID;
   }

   @JsonIgnore
   public void setAssociatedIngressQOSPolicyID(String value) { 
      this.associatedIngressQOSPolicyID = value;
   }
   
   @JsonIgnore
   public String getAssociatedIngressUnderlayQoSPolicerID() {
      return associatedIngressUnderlayQoSPolicerID;
   }

   @JsonIgnore
   public void setAssociatedIngressUnderlayQoSPolicerID(String value) { 
      this.associatedIngressUnderlayQoSPolicerID = value;
   }
   
   @JsonIgnore
   public String getAssociatedUplinkConnectionID() {
      return associatedUplinkConnectionID;
   }

   @JsonIgnore
   public void setAssociatedUplinkConnectionID(String value) { 
      this.associatedUplinkConnectionID = value;
   }
   
   @JsonIgnore
   public String getAssociatedVSCProfileID() {
      return associatedVSCProfileID;
   }

   @JsonIgnore
   public void setAssociatedVSCProfileID(String value) { 
      this.associatedVSCProfileID = value;
   }
   
   @JsonIgnore
   public String getDescription() {
      return description;
   }

   @JsonIgnore
   public void setDescription(String value) { 
      this.description = value;
   }
   
   @JsonIgnore
   public Boolean getDucVlan() {
      return ducVlan;
   }

   @JsonIgnore
   public void setDucVlan(Boolean value) { 
      this.ducVlan = value;
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
   public String getGatewayID() {
      return gatewayID;
   }

   @JsonIgnore
   public void setGatewayID(String value) { 
      this.gatewayID = value;
   }
   
   @JsonIgnore
   public Boolean getIsUplink() {
      return isUplink;
   }

   @JsonIgnore
   public void setIsUplink(Boolean value) { 
      this.isUplink = value;
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
   public PermittedAction getPermittedAction() {
      return permittedAction;
   }

   @JsonIgnore
   public void setPermittedAction(PermittedAction value) { 
      this.permittedAction = value;
   }
   
   @JsonIgnore
   public Boolean getReadonly() {
      return readonly;
   }

   @JsonIgnore
   public void setReadonly(Boolean value) { 
      this.readonly = value;
   }
   
   @JsonIgnore
   public Boolean getRestricted() {
      return restricted;
   }

   @JsonIgnore
   public void setRestricted(Boolean value) { 
      this.restricted = value;
   }
   
   @JsonIgnore
   public Status getStatus() {
      return status;
   }

   @JsonIgnore
   public void setStatus(Status value) { 
      this.status = value;
   }
   
   @JsonIgnore
   public String getTemplateID() {
      return templateID;
   }

   @JsonIgnore
   public void setTemplateID(String value) { 
      this.templateID = value;
   }
   
   @JsonIgnore
   public Type getType() {
      return type;
   }

   @JsonIgnore
   public void setType(Type value) { 
      this.type = value;
   }
   
   @JsonIgnore
   public Boolean getUseUserMnemonic() {
      return useUserMnemonic;
   }

   @JsonIgnore
   public void setUseUserMnemonic(Boolean value) { 
      this.useUserMnemonic = value;
   }
   
   @JsonIgnore
   public String getUserMnemonic() {
      return userMnemonic;
   }

   @JsonIgnore
   public void setUserMnemonic(String value) { 
      this.userMnemonic = value;
   }
   
   @JsonIgnore
   public Long getValue() {
      return value;
   }

   @JsonIgnore
   public void setValue(Long value) { 
      this.value = value;
   }
   
   @JsonIgnore
   public String getVportID() {
      return vportID;
   }

   @JsonIgnore
   public void setVportID(String value) { 
      this.vportID = value;
   }
   

   
   @JsonIgnore
   public AlarmsFetcher getAlarms() {
      return alarms;
   }
   
   @JsonIgnore
   public BGPNeighborsFetcher getBGPNeighbors() {
      return bGPNeighbors;
   }
   
   @JsonIgnore
   public BRConnectionsFetcher getBRConnections() {
      return bRConnections;
   }
   
   @JsonIgnore
   public EnterprisePermissionsFetcher getEnterprisePermissions() {
      return enterprisePermissions;
   }
   
   @JsonIgnore
   public EventLogsFetcher getEventLogs() {
      return eventLogs;
   }
   
   @JsonIgnore
   public GlobalMetadatasFetcher getGlobalMetadatas() {
      return globalMetadatas;
   }
   
   @JsonIgnore
   public IKEGatewayConnectionsFetcher getIKEGatewayConnections() {
      return iKEGatewayConnections;
   }
   
   @JsonIgnore
   public LtestatisticsFetcher getLtestatistics() {
      return ltestatistics;
   }
   
   @JsonIgnore
   public MetadatasFetcher getMetadatas() {
      return metadatas;
   }
   
   @JsonIgnore
   public PATNATPoolsFetcher getPATNATPools() {
      return pATNATPools;
   }
   
   @JsonIgnore
   public PermissionsFetcher getPermissions() {
      return permissions;
   }
   
   @JsonIgnore
   public StatisticsFetcher getStatistics() {
      return statistics;
   }
   
   @JsonIgnore
   public UplinkConnectionsFetcher getUplinkConnections() {
      return uplinkConnections;
   }
   

   public String toString() {
      return "VLAN [" + "associatedBGPProfileID=" + associatedBGPProfileID + ", associatedConnectionType=" + associatedConnectionType + ", associatedEgressQOSPolicyID=" + associatedEgressQOSPolicyID + ", associatedIngressOverlayQoSPolicerID=" + associatedIngressOverlayQoSPolicerID + ", associatedIngressQOSPolicyID=" + associatedIngressQOSPolicyID + ", associatedIngressUnderlayQoSPolicerID=" + associatedIngressUnderlayQoSPolicerID + ", associatedUplinkConnectionID=" + associatedUplinkConnectionID + ", associatedVSCProfileID=" + associatedVSCProfileID + ", description=" + description + ", ducVlan=" + ducVlan + ", entityScope=" + entityScope + ", externalID=" + externalID + ", gatewayID=" + gatewayID + ", isUplink=" + isUplink + ", lastUpdatedBy=" + lastUpdatedBy + ", permittedAction=" + permittedAction + ", readonly=" + readonly + ", restricted=" + restricted + ", status=" + status + ", templateID=" + templateID + ", type=" + type + ", useUserMnemonic=" + useUserMnemonic + ", userMnemonic=" + userMnemonic + ", value=" + value + ", vportID=" + vportID + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
              + lastUpdatedDate + ", owner=" + owner  + "]";
   }
   
   
}