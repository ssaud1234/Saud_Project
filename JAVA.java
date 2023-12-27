// التقاط الحدث عند تقديم النموذج
document.querySelectorAll('form').forEach(form => {
    form.addEventListener('submit', function(event) {
        event.preventDefault(); // منع سلوك النموذج الافتراضي
        
        // احصل على قيم الحقول
        const name = this.querySelector('[name="name"]').value;
        const email = this.querySelector('[name="email"]').value;
        const message = this.querySelector('[name="message"]').value;

        // عرض رسالة بالبيانات التي قام المستخدم بإدخالها
        alert(`شكرًا ${name}! تم استلام رسالتك: "${message}"`);
    });
});
``
