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

package net.nuagenetworks.vspk.v4_0;

import net.nuagenetworks.bambou.RestObject;
import net.nuagenetworks.bambou.annotation.RestEntity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

import net.nuagenetworks.vspk.v4_0.fetchers.PATNATPoolsFetcher;
import net.nuagenetworks.vspk.v4_0.fetchers.PermissionsFetcher;
import net.nuagenetworks.vspk.v4_0.fetchers.WANServicesFetcher;
import net.nuagenetworks.vspk.v4_0.fetchers.MetadatasFetcher;
import net.nuagenetworks.vspk.v4_0.fetchers.AlarmsFetcher;
import net.nuagenetworks.vspk.v4_0.fetchers.GlobalMetadatasFetcher;
import net.nuagenetworks.vspk.v4_0.fetchers.EnterprisePermissionsFetcher;
import net.nuagenetworks.vspk.v4_0.fetchers.JobsFetcher;
import net.nuagenetworks.vspk.v4_0.fetchers.PortsFetcher;
import net.nuagenetworks.vspk.v4_0.fetchers.EventLogsFetcher;

@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "gateway", resourceName = "gateways")
public class Gateway extends RestObject {

   private static final long serialVersionUID = 1L;

   
   public enum PermittedAction { ALL, DEPLOY, EXTEND, INSTANTIATE, READ, USE };
   public enum Personality { DC7X50, HARDWARE_VTEP, NSG, OTHER, VRSG, VSA, VSG };
   public enum EntityScope { ENTERPRISE, GLOBAL };

   
   @JsonProperty(value = "name")
   protected String name;
   
   @JsonProperty(value = "lastUpdatedBy")
   protected String lastUpdatedBy;
   
   @JsonProperty(value = "redundancyGroupID")
   protected String redundancyGroupID;
   
   @JsonProperty(value = "peer")
   protected String peer;
   
   @JsonProperty(value = "templateID")
   protected String templateID;
   
   @JsonProperty(value = "pending")
   protected Boolean pending;
   
   @JsonProperty(value = "permittedAction")
   protected PermittedAction permittedAction;
   
   @JsonProperty(value = "personality")
   protected Personality personality;
   
   @JsonProperty(value = "description")
   protected String description;
   
   @JsonProperty(value = "enterpriseID")
   protected String enterpriseID;
   
   @JsonProperty(value = "entityScope")
   protected EntityScope entityScope;
   
   @JsonProperty(value = "vtep")
   protected String vtep;
   
   @JsonProperty(value = "autoDiscGatewayID")
   protected String autoDiscGatewayID;
   
   @JsonProperty(value = "externalID")
   protected String externalID;
   
   @JsonProperty(value = "systemID")
   protected String systemID;
   

   
   @JsonIgnore
   private PATNATPoolsFetcher pATNATPools;
   
   @JsonIgnore
   private PermissionsFetcher permissions;
   
   @JsonIgnore
   private WANServicesFetcher wANServices;
   
   @JsonIgnore
   private MetadatasFetcher metadatas;
   
   @JsonIgnore
   private AlarmsFetcher alarms;
   
   @JsonIgnore
   private GlobalMetadatasFetcher globalMetadatas;
   
   @JsonIgnore
   private EnterprisePermissionsFetcher enterprisePermissions;
   
   @JsonIgnore
   private JobsFetcher jobs;
   
   @JsonIgnore
   private PortsFetcher ports;
   
   @JsonIgnore
   private EventLogsFetcher eventLogs;
   

   public Gateway() {
      personality = Personality.VRSG;
      
      pATNATPools = new PATNATPoolsFetcher(this);
      
      permissions = new PermissionsFetcher(this);
      
      wANServices = new WANServicesFetcher(this);
      
      metadatas = new MetadatasFetcher(this);
      
      alarms = new AlarmsFetcher(this);
      
      globalMetadatas = new GlobalMetadatasFetcher(this);
      
      enterprisePermissions = new EnterprisePermissionsFetcher(this);
      
      jobs = new JobsFetcher(this);
      
      ports = new PortsFetcher(this);
      
      eventLogs = new EventLogsFetcher(this);
      
   }

   public String getName() {
      return name;
   }

   public void setName(String value) { 
      this.name = value;
   }
   public String getLastUpdatedBy() {
      return lastUpdatedBy;
   }

   public void setLastUpdatedBy(String value) { 
      this.lastUpdatedBy = value;
   }
   public String getRedundancyGroupID() {
      return redundancyGroupID;
   }

   public void setRedundancyGroupID(String value) { 
      this.redundancyGroupID = value;
   }
   public String getPeer() {
      return peer;
   }

   public void setPeer(String value) { 
      this.peer = value;
   }
   public String getTemplateID() {
      return templateID;
   }

   public void setTemplateID(String value) { 
      this.templateID = value;
   }
   public Boolean getPending() {
      return pending;
   }

   public void setPending(Boolean value) { 
      this.pending = value;
   }
   public PermittedAction getPermittedAction() {
      return permittedAction;
   }

   public void setPermittedAction(PermittedAction value) { 
      this.permittedAction = value;
   }
   public Personality getPersonality() {
      return personality;
   }

   public void setPersonality(Personality value) { 
      this.personality = value;
   }
   public String getDescription() {
      return description;
   }

   public void setDescription(String value) { 
      this.description = value;
   }
   public String getEnterpriseID() {
      return enterpriseID;
   }

   public void setEnterpriseID(String value) { 
      this.enterpriseID = value;
   }
   public EntityScope getEntityScope() {
      return entityScope;
   }

   public void setEntityScope(EntityScope value) { 
      this.entityScope = value;
   }
   public String getVtep() {
      return vtep;
   }

   public void setVtep(String value) { 
      this.vtep = value;
   }
   public String getAutoDiscGatewayID() {
      return autoDiscGatewayID;
   }

   public void setAutoDiscGatewayID(String value) { 
      this.autoDiscGatewayID = value;
   }
   public String getExternalID() {
      return externalID;
   }

   public void setExternalID(String value) { 
      this.externalID = value;
   }
   public String getSystemID() {
      return systemID;
   }

   public void setSystemID(String value) { 
      this.systemID = value;
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
   public WANServicesFetcher getWANServices() {
      return wANServices;
   }
   
   @JsonIgnore
   public MetadatasFetcher getMetadatas() {
      return metadatas;
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
   public EnterprisePermissionsFetcher getEnterprisePermissions() {
      return enterprisePermissions;
   }
   
   @JsonIgnore
   public JobsFetcher getJobs() {
      return jobs;
   }
   
   @JsonIgnore
   public PortsFetcher getPorts() {
      return ports;
   }
   
   @JsonIgnore
   public EventLogsFetcher getEventLogs() {
      return eventLogs;
   }
   

   public String toString() {
      return "Gateway [" + "name=" + name + ", lastUpdatedBy=" + lastUpdatedBy + ", redundancyGroupID=" + redundancyGroupID + ", peer=" + peer + ", templateID=" + templateID + ", pending=" + pending + ", permittedAction=" + permittedAction + ", personality=" + personality + ", description=" + description + ", enterpriseID=" + enterpriseID + ", entityScope=" + entityScope + ", vtep=" + vtep + ", autoDiscGatewayID=" + autoDiscGatewayID + ", externalID=" + externalID + ", systemID=" + systemID + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
              + lastUpdatedDate + ", owner=" + owner  + "]";
   }
   
   
}