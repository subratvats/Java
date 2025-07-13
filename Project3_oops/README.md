****why encapsulation?****

Encapsulation is the process of:

Hiding internal details of a class and exposing only what’s necessary through methods.

✅ Why Do We Need Encapsulation?
1. Data Protection (Security)
    - Prevents direct modification of fields from outside the class.
    - Sensitive data stays safe.

2. Control Over Data
   - You decide how data is accessed/modified using methods.

   - You can add checks (validation).
````
public void setSpeed(int speed) {
if (speed >= 0) {
this.speed = speed;
    }
}
````
3. Code Maintainability & Flexibility
   - You can change internal logic without breaking external code.
   - Only method interface matters to outside users.

4. Improved Readability
   - Clean, well-structured code.

5. Easy Debugging
   - Central control point to track bugs in getters/setters.

| Feature       | With Encapsulation            |
| ------------- | ----------------------------- |
| Direct Access | ❌ No, uses getters/setters    |
| Data Safety   | ✅ Protected from bad values   |
| Flexibility   | ✅ Easy to change inside logic |
| Validation    | ✅ Possible in setter methods  |


=====================
=
***what are the thing to keep in mind while creating a class***
- member var
- constructor
- member function
