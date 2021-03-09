package eroberer_practice.design_pattern._3_behavioral.chapter_24_template_method.query_executor;

import java.util.HashMap;
import java.util.Map;

public class SpecialCustomerQueryExecutor extends QueryExecutor<SpecialCustomerDTO> {

    private Long id;

    public SpecialCustomerQueryExecutor(Long id) {
        this.id = id;
    }

    @Override
    protected String getQueryName() {
        return "specialCustomerQuery";
    }

    @Override
    protected Map<String, Object> prepareParameters() {
        Map<String, Object> parameters = new HashMap<>();
        parameters.put("ID", id);
        return parameters;
    }

    @Override
    protected SpecialCustomerDTO convertResult(Map<String, Object> results) {
        SpecialCustomerDTO specialCustomerDTO = new SpecialCustomerDTO();
        specialCustomerDTO.setId(Long.valueOf(results.get("ID").toString()));
        specialCustomerDTO.setFullName(results.get("FULL_NAME").toString());
        return specialCustomerDTO;
    }
}
