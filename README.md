# PaystackWebView - OPAY
A simple Android application that loads a Paystack checkout link in a WebView and handles in-app payment redirection, especially with Opay integration.

## Features

- Accept payments using Paystack Checkout
- Opens checkout page in a WebView
- Supports Opay as a payment method
- Automatically redirects back to the app upon completion

## Prerequisites

- Android device with **Opay app installed and not hidden**
- Valid Paystack secret key
- Backend or Postman setup to generate Paystack payment links

---

## 🔧 How to Test the App

1. **Generate a Paystack Payment Link**

   Use Paystack's [Transaction Initialize endpoint](https://paystack.com/docs/api/transaction/#initialize) to create a payment link.

   Sample API Request (POST):
   ```
   https://api.paystack.co/transaction/initialize
   Headers:
     Authorization: Bearer YOUR_SECRET_KEY
     Content-Type: application/json

   Body:
   {
     "email": "customer@example.com",
     "amount": 500000
   }
   ```

   This will return a `checkout_url` like:
   ```
   https://checkout.paystack.com/abc123xyz
   ```

2. **Launch the App**

   Open the PaystackWebView app on your Android device.

3. **Paste the Payment Link**

   Copy the generated Paystack checkout URL and paste it into the link input field within the app.

4. **Submit the Form**

   Tap the submit button to load the link in a WebView.

5. **Make Payment with Opay**

   - On the Paystack page, choose **Opay** as the payment option.
   - Ensure the Opay app is installed and **not hidden** on your device.
   - Complete the transaction using Opay.

6. **Redirection**

   After a successful payment, Paystack will redirect you back to the app.

---

## Notes

- For testing, use real payment methods or test cards as documented by Paystack.
- If Opay does not launch, check your device settings to ensure Opay is visible and not disabled.

---

## License

MIT
