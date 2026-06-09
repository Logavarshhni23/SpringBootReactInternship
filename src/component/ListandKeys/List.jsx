import React from 'react';

export default function List() {
  const arr = ['text', 'text2', 'text3'];

  return (
    <div>
      <h1>List Example</h1>
      <ul>
        {arr.map((i, index) => {
          return <li key={index}>{i}</li>;
        })}
      </ul>
    </div>
  );
}