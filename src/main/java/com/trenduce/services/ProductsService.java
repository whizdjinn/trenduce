package com.trenduce.services;

import com.trenduce.repositories.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by prafulmantale on 1/5/15.
 */

@Service
public class ProductsService {

    @Autowired
    private ProductsRepository repository;

}