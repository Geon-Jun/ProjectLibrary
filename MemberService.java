package com.project.library.retrofit.services;


import com.project.library.models.Member;
import com.project.library.retrofit.messages.requests.member.InsertMemberRequest;
import com.project.library.retrofit.messages.requests.member.UpdateMemberRequest;
import com.project.library.retrofit.messages.responses.SimpleResponse;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface MemberService {

    @GET("/members")
    Call<List<Member>> findAllMembers();

    @GET("/members/{id}")
    Call<Member> findMemberById(@Path("id") String id);

    @GET("/members/name")
    Call<List<Member>> findMemberByName(@Query("name") String name);

    @POST("/members")
    Call<SimpleResponse> insertMember(@Body InsertMemberRequest body);

    @PUT("/members/{id}")
    Call<SimpleResponse> updateMember(@Path("id") String id, @Body UpdateMemberRequest body);
    
    @DELETE("/members/{id}")
    Call<SimpleResponse> deleteMember(@Path("id") String id);

}
