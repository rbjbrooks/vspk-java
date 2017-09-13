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


import net.nuagenetworks.vspk.v4_0.fetchers.GlobalMetadatasFetcher;
import net.nuagenetworks.vspk.v4_0.fetchers.KeyServerMonitorEncryptedSeedsFetcher;
import net.nuagenetworks.vspk.v4_0.fetchers.MetadatasFetcher;

@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "keyservermonitorseed", resourceName = "keyservermonitorseeds")
public class KeyServerMonitorSeed extends RestObject {

   private static final long serialVersionUID = 1L;

   
   
   public enum EntityScope { ENTERPRISE, GLOBAL };
   
   public enum SeedTrafficAuthenticationAlgorithm { HMAC_MD5, HMAC_SHA1, HMAC_SHA256, HMAC_SHA384, HMAC_SHA512 };
   
   public enum SeedTrafficEncryptionAlgorithm { AES_128_CBC, AES_192_CBC, AES_256_CBC, TRIPLE_DES_CBC };

   
   @JsonProperty(value = "creationTime")
   protected Long creationTime;
   
   @JsonProperty(value = "entityScope")
   protected EntityScope entityScope;
   
   @JsonProperty(value = "externalID")
   protected String externalID;
   
   @JsonProperty(value = "lastUpdatedBy")
   protected String lastUpdatedBy;
   
   @JsonProperty(value = "lifetime")
   protected Long lifetime;
   
   @JsonProperty(value = "seedTrafficAuthenticationAlgorithm")
   protected SeedTrafficAuthenticationAlgorithm seedTrafficAuthenticationAlgorithm;
   
   @JsonProperty(value = "seedTrafficEncryptionAlgorithm")
   protected SeedTrafficEncryptionAlgorithm seedTrafficEncryptionAlgorithm;
   
   @JsonProperty(value = "seedTrafficEncryptionKeyLifetime")
   protected Long seedTrafficEncryptionKeyLifetime;
   
   @JsonProperty(value = "startTime")
   protected Long startTime;
   

   
   @JsonIgnore
   private GlobalMetadatasFetcher globalMetadatas;
   
   @JsonIgnore
   private KeyServerMonitorEncryptedSeedsFetcher keyServerMonitorEncryptedSeeds;
   
   @JsonIgnore
   private MetadatasFetcher metadatas;
   

   public KeyServerMonitorSeed() {
      
      globalMetadatas = new GlobalMetadatasFetcher(this);
      
      keyServerMonitorEncryptedSeeds = new KeyServerMonitorEncryptedSeedsFetcher(this);
      
      metadatas = new MetadatasFetcher(this);
      
   }

   
   @JsonIgnore
   public Long getCreationTime() {
      return creationTime;
   }

   @JsonIgnore
   public void setCreationTime(Long value) { 
      this.creationTime = value;
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
   public Long getLifetime() {
      return lifetime;
   }

   @JsonIgnore
   public void setLifetime(Long value) { 
      this.lifetime = value;
   }
   
   @JsonIgnore
   public SeedTrafficAuthenticationAlgorithm getSeedTrafficAuthenticationAlgorithm() {
      return seedTrafficAuthenticationAlgorithm;
   }

   @JsonIgnore
   public void setSeedTrafficAuthenticationAlgorithm(SeedTrafficAuthenticationAlgorithm value) { 
      this.seedTrafficAuthenticationAlgorithm = value;
   }
   
   @JsonIgnore
   public SeedTrafficEncryptionAlgorithm getSeedTrafficEncryptionAlgorithm() {
      return seedTrafficEncryptionAlgorithm;
   }

   @JsonIgnore
   public void setSeedTrafficEncryptionAlgorithm(SeedTrafficEncryptionAlgorithm value) { 
      this.seedTrafficEncryptionAlgorithm = value;
   }
   
   @JsonIgnore
   public Long getSeedTrafficEncryptionKeyLifetime() {
      return seedTrafficEncryptionKeyLifetime;
   }

   @JsonIgnore
   public void setSeedTrafficEncryptionKeyLifetime(Long value) { 
      this.seedTrafficEncryptionKeyLifetime = value;
   }
   
   @JsonIgnore
   public Long getStartTime() {
      return startTime;
   }

   @JsonIgnore
   public void setStartTime(Long value) { 
      this.startTime = value;
   }
   

   
   @JsonIgnore
   public GlobalMetadatasFetcher getGlobalMetadatas() {
      return globalMetadatas;
   }
   
   @JsonIgnore
   public KeyServerMonitorEncryptedSeedsFetcher getKeyServerMonitorEncryptedSeeds() {
      return keyServerMonitorEncryptedSeeds;
   }
   
   @JsonIgnore
   public MetadatasFetcher getMetadatas() {
      return metadatas;
   }
   

   public String toString() {
      return "KeyServerMonitorSeed [" + "creationTime=" + creationTime + ", entityScope=" + entityScope + ", externalID=" + externalID + ", lastUpdatedBy=" + lastUpdatedBy + ", lifetime=" + lifetime + ", seedTrafficAuthenticationAlgorithm=" + seedTrafficAuthenticationAlgorithm + ", seedTrafficEncryptionAlgorithm=" + seedTrafficEncryptionAlgorithm + ", seedTrafficEncryptionKeyLifetime=" + seedTrafficEncryptionKeyLifetime + ", startTime=" + startTime + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
              + lastUpdatedDate + ", owner=" + owner  + "]";
   }
   
   
}