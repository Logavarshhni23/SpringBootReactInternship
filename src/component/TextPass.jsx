import React, { useState } from 'react';

export default function PasswordToggle() {
    const [showPassword, setShowPassword] = useState(false);

    function Toggle() {
        setShowPassword(!showPassword);
    }

    return (
        <div>
            <input type={showPassword ? "text" : "password"} value="Hi"/>
            <button onClick={Toggle}>
                {showPassword ? "Hide" : "Show"}
            </button>
        </div>
    );
}