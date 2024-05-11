 protected void onCreate(Bundle savedInstanceStateSaved) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    firestore = FirebaseFirestore.getInstance();

    Map<String, Object> user =  new HashMap<>();
    user.put("null", "null");
    user.put("null", "null");
    user.put("null","null");

    firestore.collection("user").add(user).addOnSuccessListener(new OnSuccessListener<DocumentReference>() {
      @Override
      public void onSuccess(DocumentReference documentReference) {
        Toast.makeText(getApplicationContext(),"Success", Toast.LENGTH_LONG).show();
      }
    }).addOnFailureListener(new OnFailureListener() {
      @Override
      public void onFailure(@NonNull Exception e) {
        Toast.makeText(getApplicationContext(),"Fail", Toast.LENGTH_LONG).show();
      }
    });

  }