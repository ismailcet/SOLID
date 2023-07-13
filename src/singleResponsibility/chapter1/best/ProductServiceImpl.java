package singleResponsibility.chapter1.best;

import java.util.ArrayList;
import java.util.List;

public class ProductServiceImpl {
    private static List<Product> productList = new ArrayList<>();


    public void add(Product product){
        ValidationTool.productValidation(product);
        productList.add(product);
    }
    public List<Product> getAll(){
        return productList;
    }
}
