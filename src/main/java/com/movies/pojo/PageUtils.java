package com.movies.pojo;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class PageUtils {
    private Page page;
    private String path;
        //設置當前页码
    public void SetCurrent(Long CurrentPage){
        if(CurrentPage>=1){
            this.page.setCurrent(CurrentPage);
        }else {
            this.page.setCurrent(1);
        }
    }
    //获取起始页码
    public Integer getFrom(Long CurrentPage){
        int result ;
        int from =(int) (CurrentPage-2);
        if(from>0) {
            result = from;
        } else {
            result = 1;
        }
        return result;
    }
    //获取最终页码
    public Integer getLast(Long CurrentPage){
        Integer result;
        long last = CurrentPage+2;
        if(last>this.page.getPages()){
            result=(int) last;
        }else {
            result=(int)this.page.getPages();
        }
        return result;
    }

}
