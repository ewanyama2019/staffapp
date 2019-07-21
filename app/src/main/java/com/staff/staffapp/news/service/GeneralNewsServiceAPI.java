//package com.staff.staffapp.news.service;
//
//import com.staff.staffapp.news.model.GeneralNews;
//
//import java.util.List;
//
//import retrofit2.Call;
//import retrofit2.http.GET;
//
//public interface GeneralNewsServiceAPI {
//
//    @GET("api/news")
//    Call<List<GeneralNews>> getAllGeneralNews();
//
//    class NewsGeneral {
//
//        private int id;
//        private String description;
//        private int department_id;
//
//        public int getId() {
//            return id;
//        }
//
//        public String getDescription() {
//            return description;
//        }
//
//        public int getDepartment_id() {
//            return department_id;
//        }
//    }
//}
