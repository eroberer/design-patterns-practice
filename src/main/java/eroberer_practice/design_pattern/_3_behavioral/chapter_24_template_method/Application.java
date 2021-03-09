package eroberer_practice.design_pattern._3_behavioral.chapter_24_template_method;

import eroberer_practice.design_pattern._3_behavioral.chapter_24_template_method.query_executor.QueryExecutor;
import eroberer_practice.design_pattern._3_behavioral.chapter_24_template_method.query_executor.SpecialCustomerDTO;
import eroberer_practice.design_pattern._3_behavioral.chapter_24_template_method.query_executor.SpecialCustomerQueryExecutor;

public class Application {

    public static void main(String[] args) {
        QueryExecutor<SpecialCustomerDTO> queryExecutor = new SpecialCustomerQueryExecutor(123L);
        SpecialCustomerDTO specialCustomerDTO = queryExecutor.executeQuery();

        System.out.println(specialCustomerDTO);
    }
}
