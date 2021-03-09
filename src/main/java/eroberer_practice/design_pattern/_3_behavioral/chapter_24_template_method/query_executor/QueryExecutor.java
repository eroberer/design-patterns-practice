package eroberer_practice.design_pattern._3_behavioral.chapter_24_template_method.query_executor;

import java.text.MessageFormat;
import java.util.HashMap;
import java.util.Map;

public abstract class QueryExecutor<T> {

    public T executeQuery() {
        System.out.println("Creating DB connection..");
        System.out.println(MessageFormat.format("{0} query is executed with params {1} ", getQueryName(), prepareParameters()));

        Map<String, Object> fakeResults = new HashMap<>();
        fakeResults.put("ID", 123);
        fakeResults.put("FULL_NAME", "Jane");

        return convertResult(fakeResults);
    }

    protected abstract String getQueryName();

    protected abstract Map<String, Object> prepareParameters();

    protected abstract T convertResult(Map<String, Object> results);
}
