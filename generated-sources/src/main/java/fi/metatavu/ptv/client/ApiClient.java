package fi.metatavu.ptv.client;

import java.util.Map;

public abstract class ApiClient {
  
  public abstract <T> ApiResponse<T> doGETRequest(String path, ResultType<T> resultType, Map<String, Object> queryParams, Map<String, Object> postParams);
  
  public abstract <T> ApiResponse<T> doPOSTRequest(String path, ResultType<T> resultType, Map<String, Object> queryParams, Map<String, Object> postParams, Object body);
  
  public abstract <T> ApiResponse<T> doPUTRequest(String path, ResultType<T> resultType, Map<String, Object> queryParams, Map<String, Object> postParams, Object body);
  
  public abstract <T> ApiResponse<T> doDELETERequest(String path, ResultType<T> resultType, Map<String, Object> queryParams, Map<String, Object> postParams);
  
}