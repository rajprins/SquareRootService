
package com.mule.demo.ws;

import javax.jws.WebService;

@WebService(endpointInterface = "com.mule.demo.ws.SquareRootService")
public class SquareRootServiceImpl implements SquareRootService {


	@Override
	public Double getSquareRoot(int nr) {
		return Math.sqrt(nr);
	}
}

