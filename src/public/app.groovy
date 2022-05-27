@Controller class JsApp {

    @RestController
    class FirstApplication {
        @RequestMapping("/")

        String welcome() {
            "Welcome to TutorialsPoint.Com"
        }
    }


}