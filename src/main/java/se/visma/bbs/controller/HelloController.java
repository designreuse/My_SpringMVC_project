package se.visma.bbs.controller;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import se.visma.bbs.components.JsonToPojo;
import se.visma.bbs.components.UICollection;
import se.visma.bbs.model.*;

import se.visma.bbs.services.FormService;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Controller
@RequestMapping("/")
public class HelloController {

    @Autowired
    private FormService formService;

    private Form form = null;

    @RequestMapping(method = RequestMethod.GET)
    public String printWelcome(ModelMap model) {
        User user = new User();
        model.addAttribute("message", "Hello world!");
        model.addAttribute("USER", user);
        return "hello";
    }

    @RequestMapping(value="/getList", method = RequestMethod.GET)
    public @ResponseBody List<String> getList(){
        return formService.getList();
    }


    @RequestMapping(value="/getForm/{id}", method = RequestMethod.GET)
    public @ResponseBody Form getFormById(@PathVariable long id){
        this.form = formService.getForm(id);
        System.out.println(formService.getForm(id));
        return formService.getForm(id);
    }


    @RequestMapping(value="/saveForm", method = RequestMethod.POST)
    public @ResponseBody void saveForm( @RequestParam(value ="data") String jsonStr){
        System.out.println(jsonStr);

        formService.saveForm(convertToPojo(jsonStr));
    }


    @RequestMapping(value="/updateForm/{id}", method = RequestMethod.POST)
    public @ResponseBody void updateForm(@PathVariable(value="id") long id, @RequestParam(value = "data") String jsonStr ){
        System.out.println(id +" "+ convertToPojo(jsonStr));
        formService.updateForm(convertToPojo(jsonStr), id);

    }

    @RequestMapping(value = "/previewPost", method = RequestMethod.POST)
    public @ResponseBody void previewForm(@RequestParam(value = "data") String jsonStr){
        String key;
        Map<String,String> map = new HashMap<String,String>();
        ObjectMapper mapper = new ObjectMapper();
        try {
            map = mapper.readValue(jsonStr,
                    new TypeReference<HashMap<String,String>>(){});
        } catch (IOException e) {
            e.printStackTrace();
        }

        for(int i = 0; i < form.size(); i++){
            key = String.valueOf(form.get(i).getUniqueId());
            String value = map.get(key);
            form.get(i).setValue(value);
            System.out.println(form.get(i).getValue()+ " mapping to: " + form.get(i).getToMappingField());
        }

    }

    @RequestMapping("/draganddrop")
    public String dragAndDrop() {
        return "draganddrop";
    }

    private Form convertToPojo(String json){
        JsonToPojo jsonToPojo = new JsonToPojo();
        UICollection uiCollection = jsonToPojo.convert(json);
        ArrayList components = new ArrayList(uiCollection.getUiTemplates());
        Form form = new Form(components);
        return form;
    }


/*

    @RequestMapping(method = RequestMethod.POST)
    public String StringproccessForm(@ModelAttribute(value = "USER") User user, BindingResult result,ModelMap model) {
        if(result.hasErrors()){
            return "hello";
        }else{
            System.out.println("User Value is: " + user);
            model.addAttribute("USER", user);
            return "success";
        }
    }

    @RequestMapping("/overview")
    public String spaOverview() {
        return "overview";
    }

    @RequestMapping("/helloworldspa")
    public String helloWorldspa() {
        return "helloworldspa";
    }
*/
}