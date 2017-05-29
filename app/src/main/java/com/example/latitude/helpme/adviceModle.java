package com.example.latitude.helpme;

/**
 * Created by Mariem on 4/25/2017.
 */

public class adviceModle
{

    public adviceModle(int img_res, String title,String txt){
        this.setImg_res(img_res);
        this.setTitle(title);
        this.setTxt(txt);
    }



    private int img_res;
    private String  title;
    private String  txt;

    public String getTxt() {
        return txt;
    }

    public void setTxt(String txt) {
        this.txt = txt;
    }

    public int getImg_res() {
        return img_res;
    }

    public void setImg_res(int img_res) {
        this.img_res = img_res;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}


