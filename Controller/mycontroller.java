package pavanmotor.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class mycontroller {
	
	
	@RequestMapping("/")
	public ModelAndView pavan(){
		System.out.println("\nController - / ");
		ModelAndView pr= new ModelAndView("Tvscaursol");
		return pr;
	}
	
	@RequestMapping("/TvsXLsuper")
	public ModelAndView pavan995(){
		System.out.println("\nController 1 - / ");
			ModelAndView pravm= new ModelAndView("TvsXLsuper");
			return pravm;
			}
	
@RequestMapping("/TvsXl100")
public ModelAndView pavan99(){
	System.out.println("\nController 3- / ");
		ModelAndView prav= new ModelAndView("TvsXl100");
		return prav;
		}
	
@RequestMapping("/TvsScootypep")
public ModelAndView pavan999(){
	System.out.println("\nController 4- / ");
		ModelAndView pra= new ModelAndView("TvsScootypep");
		return pra;
		}

@RequestMapping("/TvsStarcity")
public ModelAndView pavan97(){
	System.out.println("\nController 6- / ");
		ModelAndView praq= new ModelAndView("TvsStarcity");
		return praq;
		}
@RequestMapping("/ApacheTVS")
public ModelAndView pavan95(){
	System.out.println("\nController 7 - / ");
		ModelAndView praw= new ModelAndView("ApacheTVS");
		return praw;
		}

@RequestMapping("/login1")
public ModelAndView pavan952(){
	System.out.println("\nController 8 - / ");
	
		ModelAndView prawk= new ModelAndView("login1");
		return prawk;
		}
@RequestMapping("Product")
public ModelAndView pavan9955(){
	System.out.println("\nController 9 - / ");
		ModelAndView pravmj= new ModelAndView("Product");
		return pravmj;
		}

@RequestMapping("zest")
public ModelAndView pavan99525(){
	System.out.println("\nController 10 - / ");
		ModelAndView pravmjl= new ModelAndView("zest");
		return pravmjl;
		}
@RequestMapping("/TvsZest")
public ModelAndView pavan98(){
	System.out.println("\nController 11- / ");
		ModelAndView praz= new ModelAndView("TvsZest");
		return praz;
		}

@RequestMapping("/starcity")
public ModelAndView pavan982(){
	System.out.println("\nController 12- / ");
		ModelAndView prazo= new ModelAndView("starcity");
		return prazo;
		}
@RequestMapping("/apache")
public ModelAndView pavan9825(){
	System.out.println("\nController 13- / ");
		ModelAndView prazop= new ModelAndView("apache");
		return prazop;
		}
@RequestMapping("/signup")
public ModelAndView pavan953(){
	System.out.println("\nController 14 - / ");
		ModelAndView prawb= new ModelAndView("signup");
		return prawb;
		}

@RequestMapping("/xlsuper")
public ModelAndView pavan9536(){
	System.out.println("\nController 15 - / ");
		ModelAndView prawbk= new ModelAndView("xlsuper");
		return prawbk;
		}
@RequestMapping("/hv100")
public ModelAndView pavan95368(){
	System.out.println("\nController 16 - / ");
		ModelAndView prawbk= new ModelAndView("hv100");
		return prawbk;
		}
@RequestMapping("/pept")
public ModelAndView pavan953689(){
	System.out.println("\nController 17 - / ");
		ModelAndView prawbk= new ModelAndView("pept");
		return prawbk;
		}

@RequestMapping("/Tvscaursol")
public ModelAndView pavan95368910(){
	System.out.println("\nController 18 - / ");
		ModelAndView prawbkij= new ModelAndView("Tvscaursol");
		return prawbkij;
		}


@RequestMapping("/Logo")
public ModelAndView showLogoPage()
{
	System.out.println("in Logo controller");
			
		return new ModelAndView("Logo");
	
}
@RequestMapping("/welcome1")
public ModelAndView showWelcomePage()
{
	System.out.println("in Logo controller");
			
		return new ModelAndView("welcome1");
	
}

@RequestMapping("/admin")
public ModelAndView showWelcomePage1()
{
	System.out.println("in Logo controllerdsfjb");
			
		return new ModelAndView("admin");
	
}

@RequestMapping("/adminhome")
public ModelAndView showWelcomePage11()
{
	System.out.println("in Logo controllerdsfjb");
			
		return new ModelAndView("adminhome");
	
}

@RequestMapping("/productspring")
public ModelAndView showWelcomePage12()
{
	System.out.println("spring product");
			
		return new ModelAndView("productspring");
	
}



}
