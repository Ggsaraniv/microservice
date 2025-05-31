package com.example.BILLINGS.Mapper;

import com.example.BILLINGS.RequestDTO.RequestDTO;
import com.example.BILLINGS.ResponseDTO.ResponseDTO;
import com.example.BILLINGS.entity.Billing;

public class BillingMapper {

	public static  ResponseDTO todto(Billing billing) {
		ResponseDTO response =new ResponseDTO();
		response.setId(billing.getId());
		response.setName(billing.getName());
		response.setPaid(billing.getPaid());
		response.setTransactionId(billing.getTransactionId());
		response.setTime(billing.getTime());
		return response;
	}
	 public static  Billing toEntity(RequestDTO requestdto) {
		        Billing billing = new Billing();
		        billing.setId(requestdto.getId());
		        billing.setName(requestdto.getName());
		        billing.setTransactionId(requestdto.getTransaction_id());
		        billing.setTime(requestdto.getTime());
		        billing.setPaid(requestdto.getPaid());
		        return billing;
	
	
	}
}
