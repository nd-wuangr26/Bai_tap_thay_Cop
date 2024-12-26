package com.example.bai_tap_thay_cop;

import android.content.Context;

public class bai_toan {
    private Context context;
    // Constructor nhận Context
    public bai_toan(Context context) {
        this.context = context;
    }
    //ko đổi tên class sau khi đã tạo ra nó
    //muốn đổi: backup code, xoá class, tạo lại
    public float ten;
    public Float tuoi;
    public String Boi_ngay() {
        //lấy chuỗi chuẩn bị trước
        //tự động lấy EN or VI tuỳ system language
        String hello = context.getString(R.string.hello);
        String rich = context.getString(R.string.rich);
        String not_rich = context.getString(R.string.not_rich);

        //thuật toán: chỉ thuần tuý java, ko liên quan đến android
        String html = hello + ten + ". ";
        if (tuoi > 18)
            html += "Da du tuoi lay chong";
        else
            html += "Lay chong la di tu";

        //trả về kq
        return html;
    }
}
