# #!/usr/bin/env python
from selenium import webdriver
from selenium.webdriver.firefox.service import Service as FirefoxService
from webdriver_manager.firefox import GeckoDriverManager
from selenium.webdriver.common.by import By

driver = webdriver.Firefox(service=FirefoxService(GeckoDriverManager().install()))
#driver.get('https://www.google.com.vn/')
#driver.get('http://automationpractice.com/index.php')
print ('Starting the browser...')
print ('Browser started successfully. Navigating to the demo page to login.')
driver.get('https://www.saucedemo.com/')
driver.find_element(By.CSS_SELECTOR, '[name="user-name"]').send_keys("modani2022")
driver.find_element(By.CSS_SELECTOR, '[name="password"]').send_keys("test123456@")

print ('End the browser...!!!!')