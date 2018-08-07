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


import net.nuagenetworks.vspk.v5_0.fetchers.BFDSessionsFetcher;

@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "brconnection", resourceName = "brconnections")
public class BRConnection extends RestObject {

   private static final long serialVersionUID = 1L;

   
   
   public enum AddressFamily { IPV4, IPV6 };
   
   public enum AdvertisementCriteria { BFD, LINK_BASED, OPENFLOW, OPERATIONAL_LINK };
   
   public enum Mode { Static };

   
   @JsonProperty(value = "DNSAddress")
   protected String DNSAddress;
   
   @JsonProperty(value = "DNSAddressV6")
   protected String DNSAddressV6;
   
   @JsonProperty(value = "address")
   protected String address;
   
   @JsonProperty(value = "addressFamily")
   protected AddressFamily addressFamily;
   
   @JsonProperty(value = "addressV6")
   protected String addressV6;
   
   @JsonProperty(value = "advertisementCriteria")
   protected AdvertisementCriteria advertisementCriteria;
   
   @JsonProperty(value = "gateway")
   protected String gateway;
   
   @JsonProperty(value = "gatewayV6")
   protected String gatewayV6;
   
   @JsonProperty(value = "inherited")
   protected Boolean inherited;
   
   @JsonProperty(value = "mode")
   protected Mode mode;
   
   @JsonProperty(value = "netmask")
   protected String netmask;
   
   @JsonProperty(value = "uplinkID")
   protected Long uplinkID;
   

   
   @JsonIgnore
   private BFDSessionsFetcher bFDSessions;
   

   public BRConnection() {
      
      bFDSessions = new BFDSessionsFetcher(this);
      
   }

   
   @JsonIgnore
   public String getDNSAddress() {
      return DNSAddress;
   }

   @JsonIgnore
   public void setDNSAddress(String value) { 
      this.DNSAddress = value;
   }
   
   @JsonIgnore
   public String getDNSAddressV6() {
      return DNSAddressV6;
   }

   @JsonIgnore
   public void setDNSAddressV6(String value) { 
      this.DNSAddressV6 = value;
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
   public AddressFamily getAddressFamily() {
      return addressFamily;
   }

   @JsonIgnore
   public void setAddressFamily(AddressFamily value) { 
      this.addressFamily = value;
   }
   
   @JsonIgnore
   public String getAddressV6() {
      return addressV6;
   }

   @JsonIgnore
   public void setAddressV6(String value) { 
      this.addressV6 = value;
   }
   
   @JsonIgnore
   public AdvertisementCriteria getAdvertisementCriteria() {
      return advertisementCriteria;
   }

   @JsonIgnore
   public void setAdvertisementCriteria(AdvertisementCriteria value) { 
      this.advertisementCriteria = value;
   }
   
   @JsonIgnore
   public String getGateway() {
      return gateway;
   }

   @JsonIgnore
   public void setGateway(String value) { 
      this.gateway = value;
   }
   
   @JsonIgnore
   public String getGatewayV6() {
      return gatewayV6;
   }

   @JsonIgnore
   public void setGatewayV6(String value) { 
      this.gatewayV6 = value;
   }
   
   @JsonIgnore
   public Boolean getInherited() {
      return inherited;
   }

   @JsonIgnore
   public void setInherited(Boolean value) { 
      this.inherited = value;
   }
   
   @JsonIgnore
   public Mode getMode() {
      return mode;
   }

   @JsonIgnore
   public void setMode(Mode value) { 
      this.mode = value;
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
   public Long getUplinkID() {
      return uplinkID;
   }

   @JsonIgnore
   public void setUplinkID(Long value) { 
      this.uplinkID = value;
   }
   

   
   @JsonIgnore
   public BFDSessionsFetcher getBFDSessions() {
      return bFDSessions;
   }
   

   public String toString() {
      return "BRConnection [" + "DNSAddress=" + DNSAddress + ", DNSAddressV6=" + DNSAddressV6 + ", address=" + address + ", addressFamily=" + addressFamily + ", addressV6=" + addressV6 + ", advertisementCriteria=" + advertisementCriteria + ", gateway=" + gateway + ", gatewayV6=" + gatewayV6 + ", inherited=" + inherited + ", mode=" + mode + ", netmask=" + netmask + ", uplinkID=" + uplinkID + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
              + lastUpdatedDate + ", owner=" + owner  + "]";
   }
   
   
}