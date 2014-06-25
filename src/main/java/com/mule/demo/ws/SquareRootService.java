package com.mule.demo.ws;

import javax.jws.WebService;

@WebService
public interface SquareRootService {
    Double getSquareRoot(int nr);
}

