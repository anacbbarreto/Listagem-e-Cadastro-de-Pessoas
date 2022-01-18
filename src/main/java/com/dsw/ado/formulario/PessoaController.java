package com.dsw.ado.formulario;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@Scope("session")
public class PessoaController {

        private static final long serialVersionUID = 1L;
        
    @Autowired
    private PessoaRepositorio pessoaRepo;

    public PessoaController(PessoaRepositorio pessoaRepo) {
        this.pessoaRepo = pessoaRepo;
    }

    
    @GetMapping("/lista")
    public String Pessoa(Model model) {
        model.addAttribute("listaPessoas", pessoaRepo.findAll());
        return "/formulario/home";
    }
    
    

    @GetMapping("/novo")
    public String novaPessoa(@ModelAttribute("pessoa") Pessoa pessoa, Model model) {
        model.addAttribute("listaPessoas", pessoaRepo.findAll());
        return "/formulario/form";
    }
    @GetMapping("/inicio")
    public String Inicio(Model model) {
        return "/inicio/inicio";
    }
    @GetMapping("/index")
    public String Index(Model model) {
        return "../static/index";
    }

   

    
    @PostMapping("/lista/salvar")
    public ModelAndView salvar(
            @ModelAttribute("pessoa") @Valid Pessoa pessoa,
            BindingResult bindingResult,
            RedirectAttributes redirectAttributes) {
        
        if (bindingResult.hasErrors()) {
           ModelAndView modelAndView = new ModelAndView("formulario/form");
            return modelAndView;
        }
                pessoaRepo.save(pessoa);
        redirectAttributes.addFlashAttribute("msg", "Usuario " + pessoa.getNomePessoa() + " adicionado com sucesso");

        ModelAndView mv = new ModelAndView("redirect:/lista");
        return mv;
    }
       
  
}
