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


import net.nuagenetworks.vspk.v4_0.fetchers.EventLogsFetcher;
import net.nuagenetworks.vspk.v4_0.fetchers.GlobalMetadatasFetcher;
import net.nuagenetworks.vspk.v4_0.fetchers.MetadatasFetcher;
import net.nuagenetworks.vspk.v4_0.fetchers.QOSsFetcher;
import net.nuagenetworks.vspk.v4_0.fetchers.SubnetTemplatesFetcher;

@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "zonetemplate", resourceName = "zonetemplates")
public class ZoneTemplate extends RestObject {

   private static final long serialVersionUID = 1L;

   
   
   public enum DPI { DISABLED, ENABLED, INHERITED };
   
   public enum IPType { IPV4, IPV6 };
   
   public enum Encryption { DISABLED, ENABLED, INHERITED };
   
   public enum EntityScope { ENTERPRISE, GLOBAL };
   
   public enum Multicast { DISABLED, ENABLED, INHERITED };

   
   @JsonProperty(value = "DPI")
   protected DPI DPI;
   
   @JsonProperty(value = "IPType")
   protected IPType IPType;
   
   @JsonProperty(value = "address")
   protected String address;
   
   @JsonProperty(value = "associatedMulticastChannelMapID")
   protected String associatedMulticastChannelMapID;
   
   @JsonProperty(value = "description")
   protected String description;
   
   @JsonProperty(value = "encryption")
   protected Encryption encryption;
   
   @JsonProperty(value = "entityScope")
   protected EntityScope entityScope;
   
   @JsonProperty(value = "externalID")
   protected String externalID;
   
   @JsonProperty(value = "lastUpdatedBy")
   protected String lastUpdatedBy;
   
   @JsonProperty(value = "multicast")
   protected Multicast multicast;
   
   @JsonProperty(value = "name")
   protected String name;
   
   @JsonProperty(value = "netmask")
   protected String netmask;
   
   @JsonProperty(value = "numberOfHostsInSubnets")
   protected Long numberOfHostsInSubnets;
   
   @JsonProperty(value = "publicZone")
   protected Boolean publicZone;
   

   
   @JsonIgnore
   private EventLogsFetcher eventLogs;
   
   @JsonIgnore
   private GlobalMetadatasFetcher globalMetadatas;
   
   @JsonIgnore
   private MetadatasFetcher metadatas;
   
   @JsonIgnore
   private QOSsFetcher qOSs;
   
   @JsonIgnore
   private SubnetTemplatesFetcher subnetTemplates;
   

   public ZoneTemplate() {
      multicast = Multicast.INHERITED;
      
      eventLogs = new EventLogsFetcher(this);
      
      globalMetadatas = new GlobalMetadatasFetcher(this);
      
      metadatas = new MetadatasFetcher(this);
      
      qOSs = new QOSsFetcher(this);
      
      subnetTemplates = new SubnetTemplatesFetcher(this);
      
   }

   
   @JsonIgnore
   public DPI getDPI() {
      return DPI;
   }

   @JsonIgnore
   public void setDPI(DPI value) { 
      this.DPI = value;
   }
   
   @JsonIgnore
   public IPType getIPType() {
      return IPType;
   }

   @JsonIgnore
   public void setIPType(IPType value) { 
      this.IPType = value;
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
   public String getAssociatedMulticastChannelMapID() {
      return associatedMulticastChannelMapID;
   }

   @JsonIgnore
   public void setAssociatedMulticastChannelMapID(String value) { 
      this.associatedMulticastChannelMapID = value;
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
   public Encryption getEncryption() {
      return encryption;
   }

   @JsonIgnore
   public void setEncryption(Encryption value) { 
      this.encryption = value;
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
   public Multicast getMulticast() {
      return multicast;
   }

   @JsonIgnore
   public void setMulticast(Multicast value) { 
      this.multicast = value;
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
   public String getNetmask() {
      return netmask;
   }

   @JsonIgnore
   public void setNetmask(String value) { 
      this.netmask = value;
   }
   
   @JsonIgnore
   public Long getNumberOfHostsInSubnets() {
      return numberOfHostsInSubnets;
   }

   @JsonIgnore
   public void setNumberOfHostsInSubnets(Long value) { 
      this.numberOfHostsInSubnets = value;
   }
   
   @JsonIgnore
   public Boolean getPublicZone() {
      return publicZone;
   }

   @JsonIgnore
   public void setPublicZone(Boolean value) { 
      this.publicZone = value;
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
   public MetadatasFetcher getMetadatas() {
      return metadatas;
   }
   
   @JsonIgnore
   public QOSsFetcher getQOSs() {
      return qOSs;
   }
   
   @JsonIgnore
   public SubnetTemplatesFetcher getSubnetTemplates() {
      return subnetTemplates;
   }
   

   public String toString() {
      return "ZoneTemplate [" + "DPI=" + DPI + ", IPType=" + IPType + ", address=" + address + ", associatedMulticastChannelMapID=" + associatedMulticastChannelMapID + ", description=" + description + ", encryption=" + encryption + ", entityScope=" + entityScope + ", externalID=" + externalID + ", lastUpdatedBy=" + lastUpdatedBy + ", multicast=" + multicast + ", name=" + name + ", netmask=" + netmask + ", numberOfHostsInSubnets=" + numberOfHostsInSubnets + ", publicZone=" + publicZone + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
              + lastUpdatedDate + ", owner=" + owner  + "]";
   }
   
   
}