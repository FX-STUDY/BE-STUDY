package hello.itemservice.item;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ItemController {

    @GetMapping("/itemList")
    public String getItemListForm(){
        return "ItemListForm";
    }

}
