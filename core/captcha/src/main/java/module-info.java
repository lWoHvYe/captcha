open module captcha {
    requires java.desktop;
    requires org.slf4j;

    exports com.anji.captcha.service;
    exports com.anji.captcha.model.common;
    exports com.anji.captcha.model.vo;

    uses com.anji.captcha.service.CaptchaService;
    uses com.anji.captcha.service.CaptchaCacheService;

    provides com.anji.captcha.service.CaptchaService with
            com.anji.captcha.service.impl.BlockPuzzleCaptchaServiceImpl,
            com.anji.captcha.service.impl.ClickWordCaptchaServiceImpl,
            com.anji.captcha.service.impl.DefaultCaptchaServiceImpl;
}
